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
	
	/**
	 * Añade una entrada a la tabla
	 * @param elemento
	 * @return La nueva entrada añadida. Null en caso de que ya estuviese en la tabla.
	 */
	public EntradaTS añadir(String elemento){
		if(buscar(elemento) == null){
			EntradaTS ent = new EntradaTS(elemento);
			this.lista.put(elemento, ent);
			return ent;
		}else
			return null;
	}
	
	public EntradaTS buscar(String elemento){
		return this.lista.get(elemento);
	}

}
