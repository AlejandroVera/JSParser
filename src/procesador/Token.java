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
		String tipo;
		switch(this.tipo){
		  case AnalizadorAsc.EOF: tipo = "EOF"; break;
		  case AnalizadorAsc.PUNTOYCOMA: tipo = "PUNTOYCOMA"; break;
		  case AnalizadorAsc.NEWLINE: tipo = "NEWLINE"; break;
		  case AnalizadorAsc.IF: tipo = "IF"; break;
		  case AnalizadorAsc.SWITCH: tipo = "SWITCH"; break;
		  case AnalizadorAsc.CASE: tipo = "CASE"; break;
		  case AnalizadorAsc.BREAK: tipo = "BREAK"; break;
		  case AnalizadorAsc.NEW: tipo = "NEW"; break;
		  case AnalizadorAsc.ARRAY: tipo = "ARRAY"; break;
		  case AnalizadorAsc.FUNCTION: tipo = "FUNCTION"; break;
		  case AnalizadorAsc.DOCWRITE: tipo = "DOCWRITE"; break;
		  case AnalizadorAsc.VAR: tipo = "VAR"; break;
		  case AnalizadorAsc.PROMPT: tipo = "PROMPT"; break;
		  case AnalizadorAsc.RETURN: tipo = "RETURN"; break;
		  case AnalizadorAsc.OPARITMETICO: tipo = "OPARITMETICO"; break;
		  case AnalizadorAsc.OPRELACIONAL: tipo = "OPRELACIONAL"; break;
		  case AnalizadorAsc.OPASIGNACION: tipo = "OPASIGNACION"; break;
		  case AnalizadorAsc.OPESPECIAL: tipo = "OPESPECIAL"; break;
		  case AnalizadorAsc.OPLOGICO: tipo = "OPLOGICO"; break;
		  case AnalizadorAsc.CORCHETEAB: tipo = "CORCHETEAB"; break;
		  case AnalizadorAsc.CORCHETECE: tipo = "CORCHETECE"; break;
		  case AnalizadorAsc.PARENTESISAB: tipo = "PARENTESISAB"; break;
		  case AnalizadorAsc.PARENTESISCE: tipo = "PARENTESISCE"; break;
		  case AnalizadorAsc.LLAVEAB: tipo = "LLAVEAB"; break;
		  case AnalizadorAsc.LLAVECE: tipo = "LLAVECE"; break;
		  case AnalizadorAsc.COMA: tipo = "COMA"; break;
		  case AnalizadorAsc.DOSPUNTOS: tipo = "DOSPUNTOS"; break;
		  case AnalizadorAsc.ENTERO: tipo = "ENTERO"; break;
		  case AnalizadorAsc.CADENA: tipo = "CADENA"; break;
		  case AnalizadorAsc.IDENTIFICADOR: tipo = "IDENTIFICADOR"; break;
		  default:  tipo = "???????"; 
		}
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

