package procesador;

import java.io.File;


public class Procesador {

	private static GestorErrores errores;
	private static GestorTS tablaSimbolos;
	
	public static void main(String[] args) {
		
		//Comprobaciones del archivo
		if(args.length < 2){
			System.err.println("ERROR - El programa tiene que recibir como argumento" +
					" la ruta del archivo con el codigo fuente a procesar.");
			System.exit(1);
		}
		
		File source = new File(args[1]);
		if(!source.exists() || !source.canRead()){
			System.err.println("No se ha podido leer el archivo: "+args[1]);
			System.exit(2);
		}
		
		//Creamos el analizador lexico
		AnalizadorLexico lexico = new AnalizadorLexico(source);
		
		//Creamos la tabla de simbolos
		tablaSimbolos = new GestorTS();
		
		//Creamos el gestor de errores
		errores = new GestorErrores(lexico);
				
		//Crear y lanzar el analizador sintatico-semantico
		AnalizadorSS ss = new AnalizadorSS(lexico);
	}
	
	public static GestorErrores getGestorErrores(){
		return errores;
	}
	
	public static GestorTS getGestorTS(){
		return tablaSimbolos;
	}

}
