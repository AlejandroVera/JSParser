package procesador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class GestorErrores {

	private AnalizadorLexico aL;
	private File archivo = null;
	FileWriter TextOut;

	public GestorErrores(AnalizadorLexico aL){
		this.aL=aL;
		String homeUsuario = System.getProperty("user.dir");
		String barraSistema = System.getProperty("file.separator");
		archivo = new File(homeUsuario+barraSistema+"errores.txt");
		
		try{
			if(archivo.exists()){
				archivo.delete();
			}
			archivo.createNewFile();
			TextOut = new FileWriter(archivo, false);
			TextOut.write("Programa generado correctamente. No contiene errores");
		}catch(Exception e){e.printStackTrace();}
	}

	public void addError(String tipo, boolean esLexico){
		int nLinea=-1, nCaracter=-1;
		String linea = null;
		nLinea=this.aL.getNLinea();
		nCaracter=this.aL.getNCaracter();
		linea=this.aL.getLinea();

	    try {
			if(archivo.exists()){
				archivo.delete();
				archivo.createNewFile();
				TextOut = new FileWriter(archivo, false);
			}
			archivo.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Error error=new Error(tipo, nLinea, nCaracter, linea);
		
		try {
			if(esLexico){
				System.out.println(error.toString());
				TextOut.write(error.toString());
			}else {
				System.out.println(error.toStringSin());
				TextOut.write(error.toStringSin());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.exit(1);
	}
	
	protected void finalize () throws Throwable {
		TextOut.close();
	}

}
