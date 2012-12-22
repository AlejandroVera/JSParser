package procesador;

public class EntradaTS {
	
	public static enum TipoEntradaTS{
		INDEFINIDO, FUNCION, VARIABLE, RESERVADA
	}
	
	String nombre;
	TipoEntradaTS tipoEntrada;
	
	
	public EntradaTS(String nombre) {
		this.nombre = nombre;
		this.tipoEntrada = TipoEntradaTS.INDEFINIDO;
	}


	public String getNombre() {
		return nombre;
	}


	public TipoEntradaTS getTipoEntrada() {
		return tipoEntrada;
	}
	

}
