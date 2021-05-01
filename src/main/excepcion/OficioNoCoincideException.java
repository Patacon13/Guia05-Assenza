package main.excepcion;

public class OficioNoCoincideException extends Exception {
	public OficioNoCoincideException() {
		super("El oficio no coincide con el del trabajo");
	}
}
