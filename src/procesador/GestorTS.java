package procesador;

import java.util.Stack;

import procesador.EntradaTS.TipoEntradaTS;

public class GestorTS {
	
	private Stack<MatBloquesEntry> matrizBloques;
	private TS tSActual;
	private TS tSGlobal;
	
	
	public GestorTS() {
		
		this.matrizBloques = new Stack<MatBloquesEntry>();
		
		//Creamos la tabla inicial (el main digamos...)
		crearTabla();
		this.tSGlobal = this.tSActual;
		
		//Inicializamos con las palabras reservadas
		String[] array = {"if", "var", "array", "new", "prompt", "document.write",
						  "switch", "case", "break", "true", "false", "function"};
		for(String s : array)
			añadir(s, true, TipoEntradaTS.RESERVADA);
		
	}
	
	/**
	 * Añade un elemento a la tabla de simbolos. Si ya está no hace nada.
	 * @param elemento Nombre del elemento a añadir.
	 * @param global True si se tiene que añadir a la TS global. False en caso contrario.
	 * @param tipo Tipo de entrada a añadir.
	 * @return La nueva entrada añadida. Null en caso de que ya estuviese en la tabla.
	 */
	public EntradaTS añadir(String elemento, boolean global, TipoEntradaTS tipo){
		
		TS tabla = (global ? this.tSGlobal : this.tSActual);
		
		EntradaTS entrada;
		switch(tipo){
			case FUNCION: entrada = (EntradaTS) new Funcion(elemento); break;
			case RESERVADA: entrada = (EntradaTS) new Reservada(elemento); break;
			case VARIABLE: entrada = (EntradaTS) new Variable(elemento); break;
			default: entrada = (EntradaTS) new EntradaTS(elemento);
		}
		return tabla.añadir(entrada);
	}
	
	/**
	 * Añade un elemento a la tabla de simbolos. Si ya está no hace nada.
	 * @param elemento Nombre del elemento a añadir.
	 * @param global True si se tiene que añadir a la TS global. False en caso contrario.
	 * @return La nueva entrada añadida. Null en caso de que ya estuviese en la tabla.
	 */
	public EntradaTS añadir(String elemento, boolean global){
		return añadir(elemento, global, TipoEntradaTS.INDEFINIDO);
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
