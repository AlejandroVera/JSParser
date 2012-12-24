package procesador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import procesador.EntradaTS.TipoEntradaTS;



/**Analizador lexico. Se encarga de leer el texto fuente y obtene los tokens
 *
 */
public class AnalizadorLexico {

	private final String digito= "1234567890";
	private final String letra= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnnopqrstuvwxyz";
	private final String alfanum= digito+letra+"_";
	private String cadena;
	private String numero;
	private Matriz matriz;

	//*********************************CLASES PRIVADAS**********************************************

	/**Clase que representa un elemento de la matriz de transicion
	 *
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
			return casillaMatriz.get(fila).get(columna);
		}

		/**
		 * Completa la fila "estadoActual" de la matriz de transicion.
		 * @param tr lista de transiciones
		 * @param estadoActual fila de la matriz
		 */
		private  void definirTransiciones(ArrayList<Transicion> tr, int estadoActual){
			System.out.println("tamaño tr: "+tr.size());
			HashSet<Character> sinUtilizar = new HashSet<Character>();
			for(int i=32; i<=126;i++){
				sinUtilizar.add((char) i);
			}

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
			if(!sinUtilizar.isEmpty()){ //el caracter que no tiene asociado una transicion no es reconocido por el lenguaje
				for(Character s :  sinUtilizar){
					casillaMatriz.get(estadoActual).put(s, new Casilla(1,"emitirError"));
				}
			}
		}
	}

	//******************************FIN CLASES PRIVADAS**********************************************

	private LinkedList<Character> buffer;
	private int puntero;
	private int estado;

	/**Constructor
	 * 
	 */
	public AnalizadorLexico(File fichero){
		this.estado=0;
		this.puntero=0;
		this.cadena="";
		this.numero="";
		this.buffer = new LinkedList<Character>();
		//Se rellena la matriz de transicion
		this.matriz = new Matriz();

		//*************estado 0********************
		ArrayList<Transicion> tr0 = new ArrayList<Transicion>();
		tr0.add(new Transicion(letra,  1, "a2"));
		tr0.add(new Transicion(digito,  2, "a3"));
		tr0.add(new Transicion("+", 3, "nada"));
		tr0.add(new Transicion("&", 4, "nada"));
		tr0.add(new Transicion("/", 5, "nada"));
		//tr0.add(new Transicion("\n", 0, "a19"));
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
		tr0.add(new Transicion("\"", 0, "a30"));

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

		obtenerChars(fichero);

		System.out.println("Caracteres del texto:");
		for(int i=0;i<buffer.size();i++){
			System.out.println(buffer.get(i));
		}
		System.out.println("columnas imprimir: "+this.matriz.casillaMatriz.size());
		for(int i=0;i<this.matriz.casillaMatriz.size();i++){
			Set<Character> s=this.matriz.casillaMatriz.get(i).keySet();
			Iterator<Character> it = s.iterator();
			while(it.hasNext()){
				char carac = it.next();
				Casilla c=this.matriz.casillaMatriz.get(i).get(carac);
				System.out.println(" fila: "+i+" columna: "+carac+" accSem: "+c.accionSem+" sigEstado: "+c.siguienteEstado);
			}
		}

	}

	/**Con este metodo se obtiene un token por parte del analizador sintáctico
	 * @return siguente token del texto
	 */
	public Token dameToken(){
		Token sol=null;
		Casilla aux=matriz.obtenerCasilla(estado,buffer.get(puntero));
		sol= doAccionSem(aux.accionSem);
		estado=aux.siguienteEstado;
		if(sol==null)	
			dameToken();
		
		System.out.println("Token generado: <"+sol.getTipo()+","+sol.getValor()+">");
		return sol;
	}

	/*+******************acciones semanticas*******************+*/
	public Token doAccionSem(String accion){
		Token token=null;
		if(accion=="nada"){
			puntero++;
		}
		else if(accion=="a20"){
			puntero++;
			token = new Token(TipoToken.PUNTOYCOMA,null);
		}
		else if(accion=="a21"){
			puntero++;
			token = new Token(TipoToken.OPRELACIONAL,">");
		}
		else if(accion=="a22"){
			puntero++;
			token = new Token(TipoToken.CORCHETEAB,null);
		}
		else if(accion=="a23"){
			puntero++;
			token = new Token(TipoToken.CORCHETECE,null);
		}
		else if(accion=="a24"){
			token = new Token(TipoToken.LLAVEAB,null);
		}
		else if(accion=="a25"){
			puntero++;
			token = new Token(TipoToken.LLAVECE,null);
		}
		else if(accion=="a26"){
			puntero++;
			token = new Token(TipoToken.PARENTESISAB,null);
		}
		else if(accion=="a27"){
			puntero++;
			token = new Token(TipoToken.PARENTESISCE,null);
		}
		else if(accion=="a28"){
			puntero++;
			token = new Token(TipoToken.COMA,null);
		}
		else if(accion=="a29"){
			puntero++;
			token = new Token(TipoToken.DOSPUNTOS,null);
		}
		else if(accion=="a30"){
			puntero++;
			token = new Token(TipoToken.COMILLAS,null);
		}
		else if(accion=="a2"){
			puntero++;
			cadena += buffer.get(puntero);
		}
		else if(accion=="a3"){
			puntero++;
			numero+=buffer.get(puntero);
		}
		else if(accion=="a4"){
			EntradaTS ets=Procesador.getGestorTS().buscar(cadena);
			if(ets!=null){ //Está en la TS
				if( ets.getTipoEntrada().equals(TipoEntradaTS.RESERVADA)){
					token = new Token(TipoToken.PALABRACLAVE, ets);
				}
			}
			else{//NO está
				token = new Token(TipoToken.PALABRACLAVE, Procesador.getGestorTS().añadir(cadena, true));
			}
			cadena="";
		}
		else if(accion=="a5"){
			token = new Token(TipoToken.ENTERO, Integer.valueOf(numero));
			numero="";
		}
		else if(accion=="a6"){
			puntero++;
			token = new Token(TipoToken.OPESPECIAL, "++");
		}
		else if(accion=="a7"){
			token = new Token(TipoToken.OPARITMETICO, "+");
		}
		else if(accion=="a8"){
			puntero++;
			token = new Token(TipoToken.OPLOGICO, "&&");
		}

		return token;
	}

	public void emitirError(){
		System.out.println("error, por ahora solo imprimo");
		System.exit(0);

	}



	/*+******************metodos auxiliares*******************+*/

	private void obtenerChars(File fichero){
		FileReader fr = null;
		try {
			fr = new FileReader(fichero);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader b = new BufferedReader(fr);
		try {
			int c;
			while((c=b.read())!=-1){
				buffer.offer((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
