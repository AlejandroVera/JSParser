package procesador;

public class Error {

	private String tipo;
	private int nLinea;
	private int nCaracter;
	private String linea;


	public Error (String tipo, int nLinea, int nCaracter, String linea){
		this.tipo=tipo;
		this.nCaracter=nCaracter;
		this.nLinea=nLinea;
		this.linea=linea;
	}
	

	@Override
	public String toString() {
		return tipo + " (Linea "+ nLinea + ", Caracter"
				+ nCaracter + "):\n"+ linea +"\n";
	}
	public String toStringSin() {
		return tipo + " (Linea "+ nLinea + "\n En la linea: "+ linea +"\n";
	}
	

}
