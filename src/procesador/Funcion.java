package procesador;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Funcion extends EntradaTS {

	private List<Integer> parametros;
	
	public Funcion(String nombre) {
		super(nombre);
		this.tipoEntrada = TipoEntradaTS.FUNCION;
		this.parametros = new LinkedList<Integer>();
	}
	
	public void addFuncion(Integer nparams){
		this.parametros.add(nparams);
	}
	
	public boolean existsWithXParam(Integer x){
		return this.parametros.contains(x); 
	}
	
	
	public int getNumParmametros(){
		return this.parametros.size();
	}

}
