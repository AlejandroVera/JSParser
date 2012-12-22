package procesador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorErrores {

	private List<Error> errores;

	private AnalizadorLexico aL;

	public GestorErrores(AnalizadorLexico aL){
		this.errores=new ArrayList<Error>();
		this.aL=aL;
	}

	public void addError(String tipo){
		int nLinea=-1, nCaracter=-1;
		String linea = null;


		//Para cuando se acabe el sintactico
		//nLinea=this.aL.getNLinea();
		//nLinea=this.aL.getNCaracter();
		//linea=this.aL.getLinea();

		Error error=new Error(tipo, nLinea, nCaracter, linea);
		this.errores.add(error);
	}

	public void imprimeErrores(){
		Iterator <Error> error=this.errores.iterator();

		while (error.hasNext()){
			System.out.println(error.next().toString());

		}
	}


}
