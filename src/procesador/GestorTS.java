package procesador;

import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

import procesador.EntradaTS.TipoEntradaTS;
import procesador.Variable.TipoVariable;

public class GestorTS {

	private Stack<MatBloquesEntry> matrizBloques;
	private TS tSActual;
	private TS tSGlobal;
	File archivo = null;


	public GestorTS() {

		this.matrizBloques = new Stack<MatBloquesEntry>();

		//Creamos la tabla inicial (el main digamos...)
		crearTabla();
		this.tSGlobal = this.tSActual;

		//Inicializamos con las palabras reservadas
		String[] array = {"if", "var", "Array", "new", "prompt", "document.write",
				"switch", "case", "break", "function", "return"};
		for(String s : array)
			añadir(s, true, TipoEntradaTS.RESERVADA);


		String homeUsuario = System.getProperty("user.home");
		String barraSistema = System.getProperty("file.separator");
		archivo = new File(homeUsuario+barraSistema+"tablaSimbolos.txt");
		try{
			if(archivo.exists()){
				archivo.delete();
			}
			archivo.createNewFile();
		}catch(Exception e){e.printStackTrace();}


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
		return añadir(elemento, global, TipoEntradaTS.VARIABLE);
	}

	/**
	 * Borra la tabla actual.
	 * @return True si se ha podido borrar. False si no había tablas que borrar.
	 */
	public boolean borrarTabla(){//Se borra en el metodo imprimirTS()
		imprimirTS();
		if(this.matrizBloques.size() == 0)
			return false;
		//Actualizamos el puntero de la TS actual
		if(this.matrizBloques.size() > 0)
			this.tSActual = this.matrizBloques.firstElement().getTS();
		else{
			this.tSActual = null;
			this.tSGlobal  = null;
		}

		return true;
	}

	private void imprimirTS() {

		TS aux=this.matrizBloques.pop().getTS();
		Collection<EntradaTS> entradas = aux.getEntradas();
		Iterator<EntradaTS> it = entradas.iterator();
		try{
			FileWriter TextOut;
			TextOut = new FileWriter(archivo, true);
			TextOut.write("++++++++++++++++++++++++++++++++++TABLA++++++++++++++++++++++++++++++++++++++"+'\n');

			while(it.hasNext()){
				EntradaTS ets = it.next();

				TextOut.write("TIPO: "+ets.getTipoEntrada()+"   ");
				TextOut.write("NOMBRE "+ets.getNombre()+"   ");
				if(ets instanceof Funcion){
					TextOut.write("NUMERO DE PARAMETROS: "+((Funcion)ets).getNumParmametros()+"   ");
				}
				if(ets instanceof Variable){
					TextOut.write("TIPO VARIABLE: "+((Variable)ets).getTipo()+"   ");
				}
				TextOut.write('\n');

			}
			TextOut.write("+++++++++++++++++++++++++++++++++++FIN TABLA+++++++++++++++++++++++++++++++++"+'\n');
			TextOut.close();
		}catch(Exception e){e.printStackTrace();}
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


	public EntradaTS setTipoVariable(String elemento, TipoParam tipo){
		EntradaTS resultado = null;

		if((resultado=buscar(elemento))!= null){
			Variable v = (Variable) resultado;
			if(tipo == TipoParam.ENTERO)
				v.setTipo(TipoVariable.ENTERO);
			else
				v.setTipo(TipoVariable.VECTOR);
		}

		return resultado;
	}


	/**
	 * Crea una nueva tabla cuyo padre es la tabla actual.
	 */
	public void crearTabla(){
		MatBloquesEntry bq = new MatBloquesEntry();
		tSActual = bq.getTS();
		this.matrizBloques.push(bq);
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


	public boolean buscarFuncionTS(String nombre, int nParam) {
		EntradaTS entrada = buscar(nombre);
		boolean encontrado = false;

		if(entrada != null && entrada instanceof Funcion){
			Funcion f = (Funcion) entrada;
			encontrado = f.existsWithXParam(nParam);
		}
		return encontrado;
	}

}
