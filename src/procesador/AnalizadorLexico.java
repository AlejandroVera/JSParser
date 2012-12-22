package procesador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;


/**Analizador lexico. Se encarga de leer el texto fuente y obtene los tokens
 *
 */
public class AnalizadorLexico {

	class Casilla{
		public int siguienteEstado;
		public Method accionSem;
		
		public Casilla(int siguienteEstado,Method accionSem){
			this.siguienteEstado=siguienteEstado;
			this.accionSem=accionSem;
		}
	}
	
	private BufferedReader buffer;
	private ArrayList<ArrayList<Casilla>> matrizT;
	private int estado;

	/**Constructor
	 * 
	 */
	public AnalizadorLexico(String fichero){
		abrirFichero(fichero);
	}

	public Token siguienteToken(){
		return null;
	}

	/*+******************metodos auxiliares*******************+*/

	private void abrirFichero(String fichero){
		File archivo = null;
		FileReader fr = null;
		try {
			archivo = new File(fichero);
			if(!archivo.exists()){
				archivo.createNewFile();
			}
			fr = new FileReader(archivo);
			buffer = new BufferedReader(fr);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}



}
