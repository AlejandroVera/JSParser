package procesador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import procesador.EntradaTS.TipoEntradaTS;
import procesador.Variable.TipoVariable;



/**Analizador lexico. Se encarga de leer el texto fuente y obtene los tokens
 *
 */
public class AnalizadorLexico implements AnalizadorAsc.Lexer{

	private final String digito= "1234567890";
	private final String letra= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
	private final String alfanum= digito+letra+"_"+".";
	private String cadena;
	private String numero;
	private Matriz matriz;
	private boolean estadoDecV;
	private int nlineaActual;
	private int nCaracterActual;
	private File fichero;
	private Token anterior;
	private File archivo = null;
	private File archivoParse = null;

	/**
	 * Estado 0 signifca que no se está en la declaración de una función.<br>
	 * Estado 1 significa que se está en la cabecera de la declaración de una función.<br>
	 * Estado 2 significa que se está declarando el cuerpo (código) de la función, por lo que no se pueden declarar otras funciones.
	 */
	private int estadoDecF;

	//*********************************CLASES PRIVADAS**********************************************

	/**Clase que representa un elemento de la matriz de transicion
	 * Cada casilla contiene el siguiente estado en el autómata y la acción semántica correspondiente
	 */
	private class Casilla{
		private int siguienteEstado;
		private String accionSem;
		//constructor
		private Casilla(int siguienteEstado,String accionSem){
			this.siguienteEstado=siguienteEstado;
			this.accionSem=accionSem;
		}
	}


	private class Transicion{
		private char[] simbolos;
		private int nuevoEstado;
		private String accionSemantica;

		private Transicion(String simbolos, int nuevoEstado, String accionSemantica){
			this.nuevoEstado=nuevoEstado;
			this.accionSemantica=accionSemantica;

			if(simbolos!=null){
				this.simbolos= simbolos.toCharArray();
			}
			else{
				this.simbolos = new char[0];
			}
		}
	}


	/**Clase que representa una matriz de transicion
	 *
	 */
	private class Matriz{

		private  ArrayList<HashMap<Character,Casilla>> casillaMatriz;


		private Matriz(){
			casillaMatriz = new ArrayList<HashMap<Character,Casilla>>(8);
		}

		private Casilla obtenerCasilla(int fila, char columna){
			Casilla sol=casillaMatriz.get(fila).get(columna);
			if(sol!=null){
				return sol;
			}
			else if((sol==null) && estado==8){
				sol= new Casilla(8,"a30");
			}
			else if((sol==null) && ((estado==6)||(estado==7)) ){
				sol= new Casilla(6,"nada");
			}
			else{
				Procesador.getGestorErrores().addError("Caracter no valido",true);
				int es=0;
				String acc=null;
				if(estado==0){
					acc="nada";
				}
				else if(estado==1){
					acc="a4";
				}
				else if(estado==2){
					acc="a5";
				}
				else if(estado==3){
					acc="a7";
				}
				sol=  new Casilla(es,acc);
			}
			return sol;
		}

		/**
		 * Completa la fila "estadoActual" de la matriz de transicion.
		 * @param tr lista de transiciones
		 * @param estadoActual fila de la matriz
		 */
		private  void definirTransiciones(ArrayList<Transicion> tr, int estadoActual){
			HashSet<Character> sinUtilizar = new HashSet<Character>();
			sinUtilizar.add((char) 32);
			sinUtilizar.add((char) 34);
			sinUtilizar.add((char) 38);
			for(int i=40; i<=44;i++){
				sinUtilizar.add((char) i);
			}
			for(int i=47; i<=59;i++){
				sinUtilizar.add((char) i);
			}
			sinUtilizar.add((char) 61);
			sinUtilizar.add((char) 62);
			for(int i=65; i<=91;i++){
				sinUtilizar.add((char) i);
				sinUtilizar.add((char) (i+32));
			}
			sinUtilizar.add((char) 93);
			sinUtilizar.add((char) 125);
			sinUtilizar.add((char) 9);
			sinUtilizar.add((char) 10);

			casillaMatriz.add(estadoActual,new  HashMap<Character,Casilla>());
			for(Transicion t :  tr){
				if(t.simbolos.length>0){
					for(int i=0; i<t.simbolos.length;i++){
						casillaMatriz.get(estadoActual).put(t.simbolos[i], new Casilla(t.nuevoEstado,t.accionSemantica));
						sinUtilizar.remove(t.simbolos[i]);
					}
				}
				else if(t.accionSemantica!=null){ //otro caracter
					Iterator<Character> it = sinUtilizar.iterator();
					while(it.hasNext()){
						char s = it.next();
						casillaMatriz.get(estadoActual).put(s, new Casilla(t.nuevoEstado,t.accionSemantica));
						it.remove();
					}
				}                       
			}
			casillaMatriz.get(estadoActual).put((char) 0, new Casilla(0,"EOF"));
		}
	}

	//******************************FIN CLASES PRIVADAS**********************************************

	private LinkedList<Character> buffer;
	private int puntero;
	private int estado;
	private boolean newline = false;

	/**Constructor
	 * 
	 */
	public AnalizadorLexico(File fichero){
		this.nlineaActual=1;
		this.nCaracterActual=0;
		this.estado=0;
		this.puntero=0;
		this.cadena="";
		this.numero="";
		this.buffer = new LinkedList<Character>();
		//Se rellena la matriz de transicion
		this.matriz = new Matriz();
		this.anterior=new Token(AnalizadorAsc.OPRELACIONAL,">");//evita nullpointerexception

		String homeUsuario = System.getProperty("user.dir");
		String barraSistema = System.getProperty("file.separator");
		archivo = new File(homeUsuario+barraSistema+"tokens.txt");
		archivoParse= new File(homeUsuario+barraSistema+"parse.txt");
		try{
			if(archivo.exists()){
				archivo.delete();
			}
			archivo.createNewFile();
			if(archivoParse.exists()){
				archivoParse.delete();
			}
			archivoParse.createNewFile();
			
			FileWriter textParse;
			textParse = new FileWriter(archivoParse, true);
			textParse.write("Ascendente");
			textParse.close();			

		}catch(Exception e){e.printStackTrace();}

		//*************estado 0********************
		ArrayList<Transicion> tr0 = new ArrayList<Transicion>();
		tr0.add(new Transicion(letra,  1, "a2"));
		tr0.add(new Transicion(digito,  2, "a3"));
		tr0.add(new Transicion("+", 3, "nada"));
		tr0.add(new Transicion("&", 4, "nada"));
		tr0.add(new Transicion("/", 5, "nada"));
		tr0.add(new Transicion(";", 0, "a20"));
		tr0.add(new Transicion(">", 0, "a21"));
		tr0.add(new Transicion("[", 0, "a22"));
		tr0.add(new Transicion("]", 0, "a23"));
		tr0.add(new Transicion("{", 0, "a24"));
		tr0.add(new Transicion("}", 0, "a25"));
		tr0.add(new Transicion("(", 0, "a26"));
		tr0.add(new Transicion(")", 0, "a27"));
		tr0.add(new Transicion(",", 0, "a28"));
		tr0.add(new Transicion(":", 0, "a29"));
		tr0.add(new Transicion("\"", 8, "a30"));
		tr0.add(new Transicion("=", 0, "a31"));
		char espacio = (char)32;
		tr0.add(new Transicion(String.valueOf(espacio), 0, "nada"));
		char tab = (char)9;
		tr0.add(new Transicion(String.valueOf(tab), 0, "nada"));
		char newLine = (char)10;
		tr0.add(new Transicion(String.valueOf(newLine), 0, "a32"));

		matriz.definirTransiciones(tr0, 0);

		//*************estado 1********************
		ArrayList<Transicion> tr1 = new ArrayList<Transicion>();
		tr1.add(new Transicion(alfanum,  1, "a2"));
		tr1.add(new Transicion(null, 0, "a4"));
		matriz.definirTransiciones(tr1, 1);

		//*************estado 2********************
		ArrayList<Transicion> tr2 = new ArrayList<Transicion>();
		tr2.add(new Transicion(digito,  2, "a3"));
		tr2.add(new Transicion(null, 0, "a5"));
		matriz.definirTransiciones(tr2, 2);

		//*************estado 3********************
		ArrayList<Transicion> tr3 = new ArrayList<Transicion>();
		tr3.add(new Transicion("+",  0, "a6"));
		tr3.add(new Transicion(null, 0, "a7"));
		matriz.definirTransiciones(tr3, 3);

		//*************estado 4********************
		ArrayList<Transicion> tr4 = new ArrayList<Transicion>();
		tr4.add(new Transicion("&",  0, "a8"));
		matriz.definirTransiciones(tr4, 4);

		//*************estado 5********************
		ArrayList<Transicion> tr5 = new ArrayList<Transicion>();
		tr5.add(new Transicion("*",  6, "nada"));
		matriz.definirTransiciones(tr5, 5);

		//*************estado 6********************
		ArrayList<Transicion> tr6 = new ArrayList<Transicion>();
		tr6.add(new Transicion("*",  7, "nada"));
		tr6.add(new Transicion(null, 6, "nada"));
		matriz.definirTransiciones(tr6, 6);

		//*************estado 7********************
		ArrayList<Transicion> tr7 = new ArrayList<Transicion>();
		tr7.add(new Transicion("/",  0, "nada"));
		tr7.add(new Transicion(null, 6, "nada"));
		matriz.definirTransiciones(tr7, 7);

		//*************estado 8********************
		ArrayList<Transicion> tr8 = new ArrayList<Transicion>();
		tr8.add(new Transicion("\"",  0, "a33"));
		tr8.add(new Transicion(null, 8, "a30"));
		matriz.definirTransiciones(tr8, 8);


		obtenerChars(fichero);

		/**
		for(int i=0;i<this.matriz.casillaMatriz.size();i++){
			Set<Character> s=this.matriz.casillaMatriz.get(i).keySet();
			Iterator<Character> it = s.iterator();
			while(it.hasNext()){
				char carac = it.next();
				Casilla c=this.matriz.casillaMatriz.get(i).get(carac);
			}
		} **/

	}

	/**Devuelve el siguiente tokens
	 * Con este metodo se obtiene un token por parte del analizador sintáctico
	 * @return siguente token del texto
	 */
	public Token dameToken(){
		Token sol=null;
		boolean cond =true;
		while(cond){
			while((sol=generaToken(matriz.obtenerCasilla(estado,buffer.get(puntero))))==null){}
			if(this.anterior.getTipo()!=AnalizadorAsc.NEWLINE || sol.getTipo()!=AnalizadorAsc.NEWLINE){
				cond=false;
			}
			anterior=sol;
		}
		//WRITE TOKEN 
		try{
			FileWriter TextOut;
			TextOut = new FileWriter(archivo, true);
			TextOut.write(sol.toString()+"\n");
			TextOut.close();
		}catch(Exception e){e.printStackTrace();}


		return sol;
	}

	private Token generaToken(Casilla aux){
		estado=aux.siguienteEstado;
		return doAccionSem(aux.accionSem);
	}

	/*+******************acciones semanticas*******************+*/
	public Token doAccionSem(String accion){
		Token token=null;
		if(newline){
			nlineaActual++;
			newline = false;
		}
		if(accion=="EOF"){
			token = new Token(AnalizadorAsc.EOF,"EOF");
		}
		else if(accion=="nada"){
			puntero++;
			nCaracterActual++;
		}
		else if(accion=="a20"){
			puntero++;
			nCaracterActual++;

			token = new Token(AnalizadorAsc.PUNTOYCOMA,";");
		}
		else if(accion=="a21"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.OPRELACIONAL,">");
		}
		else if(accion=="a22"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.CORCHETEAB,"[");
		}
		else if(accion=="a23"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.CORCHETECE,"]");
		}
		else if(accion=="a24"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.LLAVEAB,"{");
		}
		else if(accion=="a25"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.LLAVECE,"}");
		}
		else if(accion=="a26"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.PARENTESISAB,"(");
		}
		else if(accion=="a27"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.PARENTESISCE,")");
		}
		else if(accion=="a28"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.COMA,",");
		}
		else if(accion=="a29"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.DOSPUNTOS,":");
		}
		else if(accion=="a30"){
			if(buffer.get(puntero)=='\\'){
				puntero++;
				nCaracterActual++;
				if(buffer.get(puntero)=='t'){
					char aux = (char)9;
					cadena += String.valueOf(aux);
				}
				else if(buffer.get(puntero)=='"'){
					char aux = (char)34;
					cadena += String.valueOf(aux);
				}
				else if(buffer.get(puntero)=='\''){
					char aux = (char)39;
					cadena += String.valueOf(aux);
				}
				else if(buffer.get(puntero)=='n'){
					char aux = (char)10;
					cadena += String.valueOf(aux);
				}
				else{
					cadena += "\\";
					puntero--;
				}
				puntero++;
				nCaracterActual++;
			}
			else{
				cadena += buffer.get(puntero);	
				puntero++;
				nCaracterActual++;
			}
		}
		else if(accion=="a31"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.OPASIGNACION,"=");
		}
		else if(accion=="a32"){
			this.nCaracterActual=0;
			newline = true;
			puntero++;
			token = new Token(AnalizadorAsc.NEWLINE,"NL");
		}
		else if(accion=="a33"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.CADENA,cadena+"\"");
			cadena="";
		}
		else if(accion=="a2"){
			cadena += buffer.get(puntero);
			puntero++;
			nCaracterActual++;
		}
		else if(accion=="a3"){
			numero+=buffer.get(puntero);
			puntero++;
			nCaracterActual++;
		}
		else if(accion=="a4"){
			EntradaTS ets=Procesador.getGestorTS().buscar(cadena);
			if(ets!=null){ //Está en la TS
				if(cadena.contains(".")){

				}
				//Si estamos declarando una variable que ya está declarada -> error
				if(getEstadoDecV()){
					Procesador.getGestorErrores().addError("Identificador \""+cadena+"\" ya declarado.",true);
				}

				if( ets.getTipoEntrada().equals(TipoEntradaTS.RESERVADA)){
					int tipo = 0;
					switch(ets.getNombre()){
					case "Array": tipo = AnalizadorAsc.ARRAY; break;
					case "break": tipo = AnalizadorAsc.BREAK; break;
					case "case": tipo = AnalizadorAsc.CASE; break;
					case "document.write": tipo = AnalizadorAsc.DOCWRITE; break;
					case "function": tipo = AnalizadorAsc.FUNCTION; break;
					case "if": tipo = AnalizadorAsc.IF; break;
					case "new": tipo = AnalizadorAsc.NEW; break;
					case "prompt": tipo = AnalizadorAsc.PROMPT; break;
					case "return": tipo = AnalizadorAsc.RETURN; break;
					case "switch": tipo = AnalizadorAsc.SWITCH; break;
					case "var": tipo = AnalizadorAsc.VAR; break;
					}
					token = new Token(tipo, ets);
				}else{
					token = new Token(AnalizadorAsc.IDENTIFICADOR,ets);
				}
			}
			else{//NO está
				if(getEstadoDecF() != 1){
					if(getEstadoDecV())
						token = new Token(AnalizadorAsc.IDENTIFICADOR, Procesador.getGestorTS().añadir(cadena, false));
					else
						token = new Token(AnalizadorAsc.IDENTIFICADOR, Procesador.getGestorTS().añadir(cadena, true));
				}else //Estamos en la declaración del nombre y parametros de la funcion
					token = new Token(AnalizadorAsc.IDENTIFICADOR, cadena);
			}
			cadena="";
		}
		else if(accion=="a5"){
			if(Math.abs( Integer.valueOf(numero))>32768){
				Procesador.getGestorErrores().addError("Entero fuera de rango",true);
			}
			token = new Token(AnalizadorAsc.ENTERO, Integer.valueOf(numero));
			numero="";
		}
		else if(accion=="a6"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.OPESPECIAL, "++");
		}
		else if(accion=="a7"){
			token = new Token(AnalizadorAsc.OPARITMETICO, "+");
		}
		else if(accion=="a8"){
			puntero++;
			nCaracterActual++;
			token = new Token(AnalizadorAsc.OPLOGICO, "&&");
		}
		else if(accion=="emitirError"){
			Procesador.getGestorErrores().addError("caracter no valido",true);
		}

		return token;
	}


	public void setEstadoDecV(boolean v){
		System.out.println("Cambiamos estado de declaracion de var a "+v);
		this.estadoDecV = v;
	}

	public void setEstadoDecF(int v){
		System.out.println("Cambiamos estado de declaracion de funcion a "+v);
		this.estadoDecF = v;
	}

	/*+******************metodos auxiliares*******************+*/

	private void obtenerChars(File fichero){
		FileReader fr = null;
		this.fichero=fichero;
		try {
			fr = new FileReader(fichero);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader lineaReader = new BufferedReader(fr);
		try {
			int c;
			while((c=lineaReader.read())!=-1){
				buffer.offer((char)c);
			}
			buffer.offer((char)0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}





	public void yyerror (String s)
	{
		Procesador.errores.addError(s,true);
	}


	Parametros yylval;

	public Parametros getLVal() {
		return yylval;
	}

	public int yylex () throws IOException {
		Token t = dameToken();
		System.out.println(t.toString());
		yylval = new Parametros();
		int tokenid = t.getTipo();

		if(t.getValor() instanceof String)
			yylval.nombre = (String) t.getValor();

		if(tokenid == AnalizadorAsc.IDENTIFICADOR){
			if(t.getValor() != null && !(t.getValor() instanceof String)){
				EntradaTS entrada = (EntradaTS) t.getValor();
				yylval.entrada = entrada;
				yylval.nombre = entrada.getNombre();
				if(entrada instanceof Funcion)
					yylval.tipo = TipoParam.FUNCION;
				else if(entrada instanceof Variable){
					Variable v = (Variable) entrada;
					if(v.getTipo() == TipoVariable.ENTERO)
						yylval.tipo = TipoParam.ENTERO;
					else if(v.getTipo() == TipoVariable.VECTOR)
						yylval.tipo = TipoParam.VECTOR;
					else
						yylval.tipo = TipoParam.NULO;
				}
			}
		}else if(tokenid == AnalizadorAsc.ENTERO){
			yylval.tipo = TipoParam.ENTERO;
		}else if(tokenid == AnalizadorAsc.CADENA)
			yylval.tipo = TipoParam.CADENA;
		System.out.println("Pedido token "+t.getValor() + " numerito: "+tokenid);

		return tokenid;
	}

	public int getEstadoDecF() {
		return estadoDecF;
	}

	public boolean getEstadoDecV() {
		return estadoDecV;
	}

	public int getNLinea() {
		return nlineaActual;
	}

	public int getNCaracter() {
		return nCaracterActual;
	}
	public String getLinea(){
		String sol=null;
		int i=1;
		FileReader fr=null;
		try {
			fr = new FileReader(this.fichero);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		BufferedReader b = new BufferedReader(fr);
		while(i<=nlineaActual){
			try {
				sol= b.readLine();
				i++;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sol;
	}
	
	public void addParse (int i){
		FileWriter textParse;
		try {
			textParse = new FileWriter(archivoParse, true);
			textParse.write(" "+i);
			textParse.close();	
		} catch (IOException e) {
			}
		
	}

}
