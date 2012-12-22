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
