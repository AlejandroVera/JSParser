package procesador;

public class Reservada extends EntradaTS {

	public Reservada(String nombre) {
		super(nombre.toLowerCase());
		this.tipoEntrada = TipoEntradaTS.RESERVADA;
	}

}
