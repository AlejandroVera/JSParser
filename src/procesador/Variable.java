package procesador;

public class Variable extends EntradaTS {
	
	public static enum TipoVariable{
		INDEFINIDO, ENTERO, VECTOR
	}
	
	private TipoVariable tipo;
	private int valor;

	public Variable(String nombre) {
		super(nombre);
		this.tipoEntrada = TipoEntradaTS.VARIABLE;
	}
	
	public Variable(String nombre, TipoVariable tipo) {
		this(nombre);
		this.tipo = tipo;  
	}
	
	public void setTipo(TipoVariable tipo){
		this.tipo = tipo;  
	}
	
	public TipoVariable getTipo(){
		return this.tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
