package procesador;


public class GestorErrores {

	private AnalizadorLexico aL;

	public GestorErrores(AnalizadorLexico aL){
		this.aL=aL;
	}

	public void addError(String tipo, boolean esLexico){
		int nLinea=-1, nCaracter=-1;
		String linea = null;
		nLinea=this.aL.getNLinea();
		nCaracter=this.aL.getNCaracter();
		linea=this.aL.getLinea();

		Error error=new Error(tipo, nLinea, nCaracter, linea);
		if(esLexico)
			System.out.println(error.toString());
		else 
			System.out.println(error.toStringSin());
		
		System.exit(1);
	}

}
