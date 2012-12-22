package procesador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;



/**Analizador lexico. Se encarga de leer el texto fuente y obtene los tokens
 *
 */
public class AnalizadorLexico {

	private final String digito= "1234567890";
	private final String letra= "_ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnnopqrstuvwxyz";
	private final String alfanum= digito+letra;


	//*********************************CLASES PRIVADAS**********************************************

	/**Clase que representa un elemento de la matriz de transicion
	 *
	 */
	private class Casilla{
		private int siguienteEstado;
		private Method accionSem;
		//constructor
		public Casilla(int siguienteEstado,Method accionSem){
			this.siguienteEstado=siguienteEstado;
			this.accionSem=accionSem;
		}
	}


	/**Clase que representa una matriz de transicion
	 *
	 */
	private class Matriz{

		private HashMap<String,Casilla>[] estados;
		//constructor
		private Matriz(){
			try {
				estados = new HashMap[29];
				

				Class[] arg1 = new Class[1];
				arg1[0]=Class.forName("TipoToken");

				estados[0]=new HashMap<String,Casilla>();
				estados[0].put(";",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("[",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("]",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("(",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put(")",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("{",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("}",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put(",",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put(":",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("\"",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put(">",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put(digito,new Casilla(1,Class.forName("AnalizadorLexico").getMethod("a1",arg1)));
				estados[0].put(letra,new Casilla(1,Class.forName("AnalizadorLexico").getMethod("a1",arg1)));
				estados[0].put("+",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("&",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("/",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[0].put("*",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				
				
				estados[1].put(alfanum,new Casilla(1,Class.forName("AnalizadorLexico").getMethod("a1",arg1)));
				
				estados[2].put(digito,new Casilla(1,Class.forName("AnalizadorLexico").getMethod("a1",arg1)));
				
				estados[3].put("+",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				
				estados[4].put("&",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				
				estados[5].put("/",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				estados[5].put("*",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
				
				estados[6].put("/",new Casilla(1,Class.forName("AnalizadorLexico").getMethod("accionSem1",arg1)));
			
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}


		//obtiene una casilla de la matriz
		private Casilla getCasilla(int estado,char tipo ){
			return null;
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
		this.estado=1;
		this.puntero=0;
		obtenerChars(fichero);
	}

	/**Con este metodo se obtiene un token por parte del analizador sintáctico
	 * @return siguente token del texto
	 */
	public Token dameToken(){
		return null;
	}

	/*+******************acciones semanticas*******************+*/
	public Token accionSem1(TipoToken t){
		if(t.equals(TipoToken.COMA)){

		}
		return null;
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
