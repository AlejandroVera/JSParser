package procesador;

public class Token {

	private int tipo;
	private Object valor;

	public Token(int tipo, Object valor){
		this.tipo=tipo;
		this.valor=valor;
	}

	public int getTipo(){
		return this.tipo;
	}

	public Object getValor(){
		return this.valor;
	}

	public String toString(){
		String sol = null;
		sol="< "+tipo+" , ";
		if(valor instanceof String){
			sol+=(String)valor;
		}
		else if(valor instanceof Integer){
			sol+=((Integer)valor).toString();
		}
		else if(valor instanceof EntradaTS){
			sol+=((EntradaTS)valor).toString();
		}
		sol+=" > ";
		return sol;
	}
}

