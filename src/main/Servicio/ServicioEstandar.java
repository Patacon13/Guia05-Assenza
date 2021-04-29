package main.Servicio;

public class ServicioEstandar extends Servicio {
	private int montoFijo;

	
	public ServicioEstandar(int montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	public double costo(int plusProfesional) {
		int costoFinal = montoFijo + plusProfesional;
		return urgente ? costoFinal*1.5 : costoFinal;
	}
}
