package main.excepcion;

public class AgendaOcupadaException extends Exception {
	public AgendaOcupadaException() {
		super("El trabajador tiene ocupado ese dia");
	}
}
