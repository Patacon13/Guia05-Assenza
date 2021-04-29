package main.Trabajador;

import java.util.ArrayList;

public class Trabajador {
	private String oficio, nombre, correoElectronico;;
	private ArrayList<Trabajo> listaDeTrabajos = new ArrayList<Trabajo>();
	private int costoPorHora, porcentajePorComision;
	public Trabajador(String nombre, String correoElectronico, int costoPorHora, int porcentajePorComision, String oficio) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.costoPorHora = costoPorHora;
		this.porcentajePorComision = porcentajePorComision;
		this.oficio = oficio;
	}
}
