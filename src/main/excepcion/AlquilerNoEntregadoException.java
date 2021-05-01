package main.excepcion;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("El usuario cuenta actualmente con mas de dos alquileres.");
	}
}
