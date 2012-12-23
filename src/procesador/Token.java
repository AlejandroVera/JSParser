package procesador;

public class Token {
	
	private TipoToken tipo;
	private String valor;
	
	public Token(TipoToken tipo, String valor){
		this.tipo=tipo;
		this.valor=valor;
	}
	
	public TipoToken getTipo(){
		return this.tipo;
	}
	
	public String getValor(){
		return this.valor;
	}
}

