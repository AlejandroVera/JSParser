package procesador;

import java.util.Collection;
import java.util.HashMap;

/**
 * Cada una de las tablas que contiene la Tabla de Símbolos.
 */
public class TS {
	
	private HashMap<String, EntradaTS> lista;
	private static int totalTS = 0;
	private int numeroTS;
	
	public TS(){
		this.lista = new HashMap<String, EntradaTS>();
		this.numeroTS = ++totalTS;
	}
	
	public int getNumeroTS() {
		return numeroTS;
	}

	public Collection<EntradaTS> getEntradas(){
		return this.lista.values();
	}
	
	/**
	 * Añade una entrada a la tabla
	 * @param elemento
	 * @return La nueva entrada añadida. Null en caso de que ya estuviese en la tabla.
	 */
	public EntradaTS añadir(EntradaTS elemento){
		if(buscar(elemento.getNombre()) == null){
			this.lista.put(elemento.getNombre(), elemento);
			return elemento;
		}else
			return null;
	}
	
	public EntradaTS buscar(String elemento){
		return this.lista.get(elemento);
	}
	
	public boolean borrar(String elemento){
		return (this.lista.remove(elemento) != null);
	}

}
