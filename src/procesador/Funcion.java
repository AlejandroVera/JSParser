package procesador;

import java.util.LinkedList;
import java.util.List;

public class Funcion extends EntradaTS {

	List<Variable.TipoVariable> parametros;
	
	public Funcion(String nombre) {
		super(nombre);
		this.tipoEntrada = TipoEntradaTS.FUNCION;
		this.parametros = new LinkedList<Variable.TipoVariable>();
	}
	
	public void addParametro(Variable.TipoVariable tipo){
		this.parametros.add(tipo);
	}
	
	public List<Variable.TipoVariable> getParametros(){
		return this.parametros; 
	}

}
