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

	public String toString(){
		String sol = null;
		sol="tipo: "+tipo.toString()+"valor: ";
		if(valor instanceof String){
			sol+=(String)valor;
		}
		else if(valor instanceof Integer){
			sol+=((Integer)valor).toString();
		}
		else{
			
		}
		return sol;
	}
}

