package procesador;

import java.util.Stack;

public class TablaSimbolos {
	
	private Stack<MatBloquesEntry> matrizBloques;
	private TS tSActual;
	private TS tSGlobal;
	
	
	public TablaSimbolos() {
		
		this.matrizBloques = new Stack<MatBloquesEntry>();
		
		//Creamos la tabla inicial (el main digamos...)
		crearTabla();
		this.tSGlobal = this.tSActual;
		
	}
	
	/**
	 * Añade un elemento a la tabla de simbolos. Si ya está no hace nada.
	 * @param elemento Nombre del elemento a añadir.
	 * @param global Tru si se tiene que añadir a la TS global. False en caso contrario.
	 */
	void añadir(String elemento, boolean global){
		TS tabla = (global ? this.tSGlobal : this.tSActual);
		tabla.añadir(elemento);
	}
	
	/**
	 * Borra la tabla actual.
	 * @return True si se ha podido borrar. False si no había tablas que borrar.
	 */
	public boolean borrarTabla(){
		if(this.matrizBloques.size() == 0)
			return false;
		
		//Eliminamos la TS
		this.matrizBloques.pop();
		
		//Actualizamos el puntero de la TS actual
		if(this.matrizBloques.size() > 0)
			this.tSActual = this.matrizBloques.firstElement().getTS();
		else{
			this.tSActual = null;
			this.tSGlobal  = null;
		}
		
		return true;
	}
	
	/**
	 * Realiza una búsqueda por todas las tablas de simbolos empezando por la actual y acabando por la global.
	 * @param elemento Elemento a buscar
	 * @return Devuelve la entrada en caso de encontrarla; sino null.
	 */
	public EntradaTS buscar(String elemento){
		EntradaTS resultado = null;
		
		for (MatBloquesEntry entry : this.matrizBloques){
			if((resultado = entry.getTS().buscar(elemento)) != null)
				break; 
		}
		
		return resultado;
	}
	
	
	/**
	 * Crea una nueva tabla cuyo padre es la tabla actual.
	 */
	public void crearTabla(){
		this.matrizBloques.push(new MatBloquesEntry());
	}
	
	
	class MatBloquesEntry {

		/**
		 * Tabla de Simbolos correspondiente a este bloque.
		 */
		private TS TSBloque;
		
		public MatBloquesEntry(TS tSBloque) {
			this.TSBloque = tSBloque;
		}
		
		public MatBloquesEntry() {
			this(new TS());
		}

		public TS getTS() {
			return this.TSBloque;
		}
		
	}

}
