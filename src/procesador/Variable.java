package procesador;

public class Variable extends EntradaTS {
	
	public static enum TipoVariable{
		ENTERO, BOOLEANO
	}
	
	private TipoVariable tipo;

	public Variable(String nombre) {
		super(nombre);
		this.tipoEntrada = TipoEntradaTS.VARIABLE;
	}
	
	public void setTipo(TipoVariable tipo){
		this.tipo = tipo;  
	}
	
	public TipoVariable getTipo(){
		return this.tipo;
	}

}
