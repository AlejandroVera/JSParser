package procesador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

import procesador.Token.TipoToken;


/**Analizador lexico. Se encarga de leer el texto fuente y obtene los tokens
 *
 */
public class AnalizadorLexico {

	/**Clase que representa un elemento de la matriz 
	 *
	 */
	class Casilla{
		public int siguienteEstado;
		public Method accionSem;

		public Casilla(int siguienteEstado,Method accionSem){
			this.siguienteEstado=siguienteEstado;
			this.accionSem=accionSem;
		}
	}

	private BufferedReader buffer;
	private Map< TipoToken, ArrayList<Casilla> > matrizT;
	private int estado;

	/**Constructor
	 * 
	 */
	public AnalizadorLexico(File fichero){
		ArrayList<Casilla> columnas = new ArrayList<Casilla>(23);

		abrirFichero(fichero);
	}

	public Token siguienteToken(){
		return null;
	}

	/*+******************metodos auxiliares*******************+*/

	private void abrirFichero(File fichero){
		File archivo = null;
		FileReader fr = null;
		try {
			fr = new FileReader(archivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		buffer = new BufferedReader(fr);

	}



}
