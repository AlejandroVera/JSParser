package procesador;

import java.util.List;

/**
 * Cada una de las filas de cada una de las tablas de a Tabla de Simbolos
 */
public class EntradaTS {
	
	/**
	 * Los diferentes tipos de datos que se pueden guardar en la tabla de simbolos.
	 */
	public static enum TipoEntradaTS{
		VARIABLE, RESERVADA, FUNCION
	}
	
	String nombre;
	TipoEntradaTS tipoEntrada;
	
	
	public EntradaTS(String nombre) {
		this.nombre = nombre;
		this.tipoEntrada = TipoEntradaTS.VARIABLE;
	}


	public String getNombre() {
		return nombre;
	}


	public TipoEntradaTS getTipoEntrada() {
		return tipoEntrada;
	}
	
	public String toString(){
		String sol = null;
		sol=" tipoEntrada: "+tipoEntrada.toString()+" nombre : "+this.nombre;
		return sol;
	}


}
