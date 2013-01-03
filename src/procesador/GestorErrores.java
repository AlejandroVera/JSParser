package procesador;


public class GestorErrores {

	private AnalizadorLexico aL;

	public GestorErrores(AnalizadorLexico aL){
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
		System.out.println(error.toString());
	}
	
}
