package main.servicio;

import java.time.LocalDate;

import main.negocio.Contratable;
import main.trabajador.Trabajador;
import main.trabajador.Trabajo;

public class ServicioEstandar extends Trabajo implements Contratable{
	private int montoFijo;
	private double plusProfesional;	
	protected boolean urgente;
	private Trabajador trabajadorEncargado;
	
	public ServicioEstandar(int montoFijo, double plusProfesional, boolean urgente, String oficio, LocalDate fechaInicio) {
		this.montoFijo = montoFijo;
		this.plusProfesional = plusProfesional;
		this.urgente = urgente;
		this.fechaInicio = fechaInicio;
		this.oficio = oficio;
	}
	
	public double costo() {
		double costoFinal = montoFijo + plusProfesional;
		return urgente ? costoFinal*1.5 : costoFinal;
	}
	
}
