package procesador;

public class Token {
	
	private TipoToken tipo;
	private int valor;
	
	public Token(TipoToken tipo, int valor){
		this.tipo=tipo;
		this.valor=valor;
	}
	
	public TipoToken getTipo(){
		return this.tipo;
	}
	
	public int getValor(){
		return this.valor;
	}
}

