package main.bien;

import java.time.Duration;
import java.time.LocalDate;

import main.negocio.Contratable;

public class Alquiler implements Contratable {
	Herramienta herramienta;
	int costoPorDia;
	LocalDate diaInicio, diaFin, diaDevolucion;
	
	public Alquiler(Herramienta herramienta, LocalDate diaFin) {
		//En este constructor el dia de inicio sera automaticamente el dia actual
		this.herramienta = herramienta;
		this.diaInicio = LocalDate.now();
		this.diaFin = diaFin;
	}
	
	public Alquiler(Herramienta herramienta, LocalDate diaInicio, LocalDate diaFin) {
		//En este constructor el dia de inicio sera el recibido como mensaje
		this.herramienta = herramienta;
		this.diaInicio = diaInicio; 
		this.diaFin = diaFin;
	}
	
	public void setDiaDevolucion() {
		//El dia de devolucion sera el dia de hoy
		this.diaDevolucion = LocalDate.now();
	}
	
	public void setDiaDevolucion(LocalDate diaDevolucion) {
		//Se selecciona como mensaje el dia de devolucion
		this.diaDevolucion = diaDevolucion;
	}
	
	public double costo() {
		long diferenciaDias;
		diferenciaDias = diaDevolucion == null ?
				Duration.between(diaInicio.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays() :
				Duration.between(diaInicio.atStartOfDay(), diaDevolucion.atStartOfDay()).toDays();
		return (int)diferenciaDias * herramienta.getCostoPorDia();
	}
	
	public boolean enMora() {
		return diaDevolucion == null ?
			LocalDate.now().isAfter(diaFin) :
			diaDevolucion.isAfter(diaFin);
	}
	
	public boolean finalizado() {
		return diaDevolucion == null ? false : true;
	}
}
