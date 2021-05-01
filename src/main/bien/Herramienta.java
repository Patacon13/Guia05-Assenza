package main.bien;

import java.time.LocalDate;

public class Herramienta {
	private String nombre;
	private double costoPorDia;
	
	public Herramienta(String nombre, double costoPorDia) {
		this.nombre = nombre;
		this.costoPorDia = costoPorDia;
	}
	
	public double getCostoPorDia() {
		return costoPorDia;
	}
}
