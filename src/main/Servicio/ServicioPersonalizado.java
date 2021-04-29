package main.Servicio;

public class ServicioPersonalizado extends Servicio{
	public ServicioPersonalizado(int montoFijo) {

	}
	
	public double costo(int valorPresupuestado, int costoMateriales, int costoTransporte) {
		int costoFinal = valorPresupuestado + costoMateriales + costoTransporte;
		return urgente ? costoFinal*1.5 : costoFinal;
	}
}
