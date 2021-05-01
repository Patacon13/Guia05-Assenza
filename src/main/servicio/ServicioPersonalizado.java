package main.servicio;


import java.time.LocalDate;

import main.negocio.Contratable;
import main.trabajador.Trabajo;

public class ServicioPersonalizado extends Trabajo implements Contratable{
	private double valorPresupuestado, costoMateriales, costoTransporte;
	protected boolean urgente;
	
	public ServicioPersonalizado(double valorPresupuestado, double costoMateriales, double costoTransporte, boolean urgente, String oficio, LocalDate fechaInicio) {
		this.valorPresupuestado = valorPresupuestado;
		this.costoMateriales = costoMateriales;
		this.costoTransporte = costoTransporte;
		this.urgente = urgente;
		this.oficio = oficio;
		this.fechaInicio = fechaInicio;
	}
	
	public double costo() {
		double costoFinal = valorPresupuestado + costoMateriales + costoTransporte;
		return urgente ? costoFinal*1.5 : costoFinal;
	}
}
