package procesador;

import java.io.File;
import java.io.IOException;


public class Procesador {

	public static GestorErrores errores;
	public static GestorTS tablaSimbolos;
	public static AnalizadorLexico lexico;
	
	public static void main(String[] args) {
		
		//Comprobaciones del archivo
		if(args.length < 1){
			System.err.println("ERROR - El programa tiene que recibir como argumento" +
					" la ruta del archivo con el codigo fuente a procesar.");
			System.exit(1);
		}
		
		File source = new File(args[0]);
		if(!source.exists() || !source.canRead()){
			System.err.println("No se ha podido leer el archivo: "+args[0]);
			System.exit(2);
		}
		
		//Creamos el analizador lexico
		lexico = new AnalizadorLexico(source);
		
		//Creamos la tabla de simbolos
		tablaSimbolos = new GestorTS();
		
		//Creamos el gestor de errores
		errores = new GestorErrores(lexico);
		new AnalizadorSS(lexico);
		AnalizadorAsc analizador = new AnalizadorAsc(lexico);
		try {
			analizador.parse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static GestorErrores getGestorErrores(){
		return errores;
	}
	
	public static GestorTS getGestorTS(){
		return tablaSimbolos;
	}

}
