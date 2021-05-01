package main.negocio;

public interface Contratable {
	public default double costo() {
		return 0;
	}
	
	public default boolean finalizado() {
		return false;
	}
	
	public default void finalizarTrabajo() {
	}
}
