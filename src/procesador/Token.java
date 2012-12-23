package procesador;

public class Token {
	
	private TipoToken tipo;
	private Object valor;
	
	public Token(TipoToken tipo, Object valor){
		this.tipo=tipo;
		this.valor=valor;
	}
	
	public TipoToken getTipo(){
		return this.tipo;
	}
	
	public Object getValor(){
		return this.valor;
	}
}

