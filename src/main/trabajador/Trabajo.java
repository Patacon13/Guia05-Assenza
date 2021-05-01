package main.trabajador;

import java.time.LocalDate;

import main.excepcion.OficioNoCoincideException;
import main.negocio.Contratable;

public abstract class Trabajo {
	protected LocalDate fechaFin;
	protected LocalDate fechaInicio;
	protected String oficio;
	
	public void setFechaFin() {
		//Este constructor setea la fecha fin como la fecha de hoy
		this.fechaFin = LocalDate.now();
	}
	
	public void setFechaFin(LocalDate fechaFin) {
		//Este constructor setea la fecha fin como la recibida por mensaje
		this.fechaFin = fechaFin;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	public void controlDeOficio(String oficio) throws OficioNoCoincideException {
		if(!this.oficio.equals(oficio))
			throw new OficioNoCoincideException();
	}
	
	public boolean finalizado() {
		return fechaFin == null ? false : true;
	}
	
	public void finalizarTrabajo() {
		fechaFin = LocalDate.now();
	}
}
