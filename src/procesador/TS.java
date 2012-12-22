package procesador;

import java.util.HashMap;

/**
 * Cada una de las tablas que contiene la Tabla de Símbolos.
 */
public class TS {
	
	private HashMap<String, EntradaTS> lista;
	
	public TS(){
		this.lista = new HashMap<String, EntradaTS>();
	}
	
	public void añadir(String elemento){
		if(buscar(elemento) == null){
			this.lista.put(elemento, new EntradaTS(elemento));
		}
	}
	
	public EntradaTS buscar(String elemento){
		return this.lista.get(elemento);
	}

}
