package main.trabajador;

import java.time.LocalDate;
import java.util.ArrayList;

import main.excepcion.*;

public class Trabajador {
	private String oficio, nombre, correoElectronico;
	private ArrayList<Trabajo> listaDeTrabajos = new ArrayList<Trabajo>();
	private int costoPorHora, porcentajePorComision;
	public Trabajador(String nombre, String correoElectronico, int costoPorHora, int porcentajePorComision, String oficio) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.costoPorHora = costoPorHora;
		this.porcentajePorComision = porcentajePorComision;
		this.oficio = oficio;
	}
	
	private void controlAgenda(LocalDate nuevaFecha) throws AgendaOcupadaException{
		for(Trabajo trabajo : listaDeTrabajos) 
			if(trabajo.getFechaInicio().equals(nuevaFecha))
				throw new AgendaOcupadaException();
	}
	
	public void asignarTrabajo(Trabajo trabajo) {
		try {
			trabajo.controlDeOficio(oficio);
			controlAgenda(trabajo.getFechaInicio());
			listaDeTrabajos.add(trabajo);
		}
		catch(OficioNoCoincideException e) {
			System.out.println(e.toString());
		}
		catch(AgendaOcupadaException e) {
			System.out.println(e.toString());
		}
	}
	
}
