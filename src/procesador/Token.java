package procesador;

public class Token {
	
	public enum TipoToken{
		PUNTOYCOMA, NEWLINE, PALABRACLAVE, 
		IDENTIFICADOR, ENTERO, OPARITMETICO,
		OPRELACIONAL, OPASIGNACION, OPESPECIAL,
		OPLOGICO, CORCHETEAB, CORCHETECE, PARENTESISAB,
		PARENTESISCE, LLAVEAB, LLAVECE, COMA, DOSPUNTOS,
		COMILLAS, EOF
	}

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

