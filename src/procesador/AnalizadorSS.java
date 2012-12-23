package procesador;

/**
 * El analizador sintactico/semántico
 *
 *
 */
public class AnalizadorSS {
	
	public AnalizadorSS(AnalizadorLexico lexico){
		Token t;
		while((t=lexico.dameToken())!=null){
			t.getTipo().toString();
		}
	}
	
}
