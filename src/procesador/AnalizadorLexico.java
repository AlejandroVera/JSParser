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
		private String accionSem;
		//constructor
		public Casilla(int siguienteEstado,String accionSem){
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
			this.simbolos= simbolos.toCharArray();
		}
	}


	/**Clase que representa una matriz de transicion
	 *
	 */
	private static class Matriz{

		private static HashMap<Character,Casilla>[] casillaMatriz;

		private static void definirTransiciones(ArrayList<Transicion> tr, int estadoActual){
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

			HashSet<Character> utilizados = new HashSet<Character>();

			for(Transicion t :  tr){
				if(t.simbolos.length>0){
					casillaMatriz[estadoActual]=new  HashMap<Character,Casilla>();
				}
				else if(t.accionSemantica!=null){

				}                       
			}
			if(!sinUtilizar.isEmpty()){
				for(Character s :  sinUtilizar){
					casillaMatriz[estadoActual]=new  HashMap<Character,Casilla>();
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
		if(accion=="a1"){

		}
		return null;
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
