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
import java.util.LinkedList;

import procesador.EntradaTS.TipoEntradaTS;



/**Analizador lexico. Se encarga de leer el texto fuente y obtene los tokens
 *
 */
public class AnalizadorLexico {

	private final String digito= "1234567890";
	private final String letra= "_ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnnopqrstuvwxyz";
	private final String alfanum= digito+letra;
	private String cadena;
	private String numero;


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


		/**
		 * Completa la fila "estadoActual" de la matriz de transicion.
		 * @param tr lista de transiciones
		 * @param estadoActual fila de la matriz
		 */
		private  void definirTransiciones(ArrayList<Transicion> tr, int estadoActual){

			HashSet<Character> sinUtilizar = new HashSet<Character>();

			sinUtilizar.add((char)32);
			char aux[]="&()[]{},+*>_".toCharArray();
			for(int i=0; i<aux.length;i++){
				sinUtilizar.add((char) aux[i]);
			}
			for(int i=47; i<=59;i++){
				sinUtilizar.add((char) i);
			}
			for(int i=65; i<=90;i++){
				sinUtilizar.add((char) i);
				sinUtilizar.add((char) (i+32));
			}

			for(Transicion t :  tr){
				casillaMatriz.add(estadoActual,new  HashMap<Character,Casilla>());
				if(t.simbolos.length>0){
					for(int i=0; i<t.simbolos.length;i++){
						casillaMatriz.get(estadoActual).put(t.simbolos[i], new Casilla(t.nuevoEstado,t.accionSemantica));
						sinUtilizar.remove(t.simbolos[i]);
					}
				}
				else if(t.accionSemantica!=null){ //otro caracter
					for(Character s :  sinUtilizar){
						casillaMatriz.get(estadoActual).put(s, new Casilla(t.nuevoEstado,t.accionSemantica));
						sinUtilizar.remove(s);
					}
				}                       
			}
			if(!sinUtilizar.isEmpty()){ //el caracter que no tiene asociado una transicion no es reconocido por el lenguaje
				for(Character s :  sinUtilizar){
					casillaMatriz.add(estadoActual,new  HashMap<Character,Casilla>());
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
		//Se rellena la matriz de transicion
		Matriz matriz = new Matriz();

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
	}

	/**Con este metodo se obtiene un token por parte del analizador sintáctico
	 * @return siguente token del texto
	 */
	public Token dameToken(){
		return null;
	}

	/*+******************acciones semanticas*******************+*/
	public Token accionSem(String accion){
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
				token = new Token(TipoToken.PALABRACLAVE, Procesador.getGestorTS().añadir(cadena, false));
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
	}



	/*+******************metodos auxiliares*******************+*/

	private void obtenerChars(File fichero){
		File archivo = null;
		FileReader fr = null;
		try {
			fr = new FileReader(archivo);
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
