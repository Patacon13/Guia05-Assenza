package main;

import java.time.LocalDate;

import main.app.Usuario;
import main.bien.Alquiler;
import main.bien.Herramienta;
import main.servicio.*;
import main.trabajador.Trabajador;
public class Main {
	public static void main(String[] args) {
		//IMPORTANTE: Main solo contiene casos de prueba.
		
		/*/Variables utilizadas/*/
		LocalDate fechaInicio = LocalDate.of(2021, 04, 20);
		LocalDate fechaFin = LocalDate.of(2021, 04, 25);
		LocalDate fechaAlternativa = LocalDate.of(2021, 05, 20);
		Herramienta herramienta = new Herramienta("Motosierra", 20);
		ServicioEstandar servicioEstandarTest1 = new ServicioEstandar(50, 10, false, "programador", fechaInicio);
		ServicioEstandar servicioEstandarTest2 = new ServicioEstandar(50, 10, true, "deportista", fechaInicio);
		servicioEstandarTest1.setFechaFin(fechaFin);
		ServicioPersonalizado servicioPersonalizadoTest1 = new ServicioPersonalizado(50,60,70,false, "programador", fechaInicio);
		ServicioPersonalizado servicioPersonalizadoTest2 = new ServicioPersonalizado(50,60,70,true, "deportista", fechaInicio);
		servicioPersonalizadoTest1.setFechaFin(fechaFin);
		Alquiler alquilerTest1 = new Alquiler(herramienta, fechaInicio, fechaFin);
		alquilerTest1.setDiaDevolucion(LocalDate.of(2021, 04, 25));
		Alquiler alquilerTest2 = new Alquiler(herramienta, fechaInicio, fechaFin);
		Alquiler alquilerTest3 = new Alquiler(herramienta, fechaInicio, fechaAlternativa);
		Alquiler alquilerTest4 = new Alquiler(herramienta, fechaInicio, fechaFin);
		alquilerTest4.setDiaDevolucion(LocalDate.of(2021, 04, 26));
		Trabajador trabajadorTest123 = new Trabajador("Tomas", "tassenza@frsf.utn.edu.ar", 25, 5, "programador");
		Usuario usuarioTest123 = new Usuario();
		/*/Variables utilizadas/*/
		
		//Prueba de inciso 4
		System.out.println("Prueba de Inciso 4");
		/*
		 * servicioEstandarTest1
		 * MontoFijo: 50
		 * PlusProfesional: 10;
		 * Urgente: NO;
		 * Valor de costo esperado: 60
		*/
		/*
		 * servicioEstandarTest2
		 * MontoFijo: 50
		 * PlusProfesional: 10;
		 * Urgente: SI;
		 * Valor de costo esperado: 90
		*/
		System.out.println("Primer valor de costo: " + servicioEstandarTest1.costo());
		System.out.println("Segundo valor de costo: " + servicioEstandarTest2.costo());
		System.out.println();
		
		/*
		 * servicioPersonalizadoTest1
		 * ValorPresupuestado: 50;
		 * CostoMateriales: 60;
		 * CostoTransporte: 70;
		 * Urgente: NO;
		 * Valor esperado de costo: 180;
		*/
		/*
		 * servicioPersonalizadoTest2
		 * ValorPresupuestado: 50;
		 * CostoMateriales: 60;
		 * CostoTransporte: 70;
		 * Urgente: SI;
		 * Valor esperado de costo: 270;
		*/
		System.out.println("TEST CASE 1:");
		System.out.println("Primer valor de costo personalizado: " + servicioPersonalizadoTest1.costo());
		System.out.println("TEST CASE 2:");
		System.out.println("Segundo valor de costo personalizado: " + servicioPersonalizadoTest2.costo());
		System.out.println();
		System.out.println();

		//Prueba de inciso 5
		System.out.println("Prueba de inciso 5");
		
		
		/*
		 * alquilerTest1
		 * Dia de inicio: 20/04/2021;
		 * Dia de fin: 25/04/2021;
		 * Dia de devolucion: 25/04/2021;
		 * Costo de la herramienta por dia: 20
		 * Valor esperado de costo: 100;
		 * Valor esperado de enMora: FALSE;
		*/
		/*
		 * alquilerTest2
		 * Dia de inicio: 20/04/2021;
		 * Dia de fin: 25/04/2021;
		 * Dia de devolucion: NULL;
		 * Costo de la herramienta por dia: 20
		 * Valor esperado de costo: 200;
		 * Valor esperado de enMora: TRUE; TESTEADO EL 30/04/2021
		*/
		/*
		 * alquilerTest3
		 * Dia de inicio: 20/04/2021;
		 * Dia de fin: 30/04/2021;
		 * Dia de devolucion: NULL;
		 * Costo de la herramienta por dia: 20
		 * Valor esperado de costo: 200;
		 * Valor esperado de enMora: FALSE; TESTEADO EL 30/04/2021
		*/
		/*
		 * alquilerTest4
		 * Dia de inicio: 20/04/2021;
		 * Dia de fin: 25/04/2021;
		 * Dia de devolucion: 26/04/2021;
		 * Costo de la herramienta por dia: 20
		 * Valor esperado de costo: 120;
		 * Valor esperado de enMora: TRUE;
		*/
		System.out.println("TEST CASE 1:");
		System.out.println("Valor de costo: " + alquilerTest1.costo());
		System.out.println("Mora: " + alquilerTest1.enMora());
		System.out.println("TEST CASE 2:");
		System.out.println("Valor de costo: " + alquilerTest2.costo());
		System.out.println("Mora: " + alquilerTest2.enMora());
		System.out.println("TEST CASE 3:");
		System.out.println("Valor de costo: " + alquilerTest3.costo());
		System.out.println("Mora: " + alquilerTest3.enMora());
		System.out.println("TEST CASE 4:");
		System.out.println("Valor de costo: " + alquilerTest4.costo());
		System.out.println("Mora: " + alquilerTest4.enMora());
		System.out.println();
		System.out.println();

		//Prueba de inciso 6
		System.out.println("Prueba de Inciso 6");
		   /*->Estos tests aprovecharan los valores establecidos previamente<-*/
		/*
		 * servicioEstandarTest1
		 * Fecha de Inicio: 25/04/2021;
		 * Fecha de Fin: 26/04/2021;
		 * Valor esperado de Finalizado: TRUE
		*/
		/*
		 * servicioEstandarTest2
		 * Fecha de Inicio: 25/04/2021;
		 * Fecha de Fin: NULL;
		 * Valor esperado de Finalizado: FALSE
		*/
		/*
		 * servicioPersonalizadoTest1
		 * Fecha de Inicio: 25/04/2021;
		 * Fecha de Fin: 26/04/2021;
		 * Valor esperado de finalizado: TRUE
		*/
		/*
		 * servicioPersonalizadoTest2
		 * Fecha de Inicio: 25/04/2021;
		 * Fecha de Fin: NULL;
		 * Valor esperado de finalizado: FALSE
		*/
		/*
		 * alquilerTest1
		 * Dia de devolucion: 25/04/2021;
		 * Valor esperado de finalizado: TRUE
		*/
		/*
		 * alquilerTest2
		 * Dia de devolucion: NULL;
		 * Valor esperado de finalizado: FALSE
		*/
		System.out.println("TEST CASE 1:");
		System.out.println("Finalizado: " + servicioEstandarTest1.finalizado());
		System.out.println("TEST CASE 2:");
		System.out.println("Finalizado: " + servicioEstandarTest2.finalizado());
		System.out.println("TEST CASE 3:");
		System.out.println("Finalizado: " + servicioPersonalizadoTest1.finalizado());
		System.out.println("TEST CASE 4:");
		System.out.println("Finalizado: " + servicioPersonalizadoTest2.finalizado());
		System.out.println("TEST CASE 5:");
		System.out.println("Finalizado: " + alquilerTest1.finalizado());
		System.out.println("TEST CASE 6:");
		System.out.println("Finalizado: " + alquilerTest2.finalizado());
		System.out.println();
		System.out.println();

		//Prueba de inciso 7
		System.out.println("Prueba de Inciso 7");
		/*
		 * trabajadorTest123
		 * usando -> servicioPersonalizadoTest2
		 * Tarea con oficio: deportista
		 * Trabajador con oficio: programador
		 * Esperada excepcion OficioNoCoincideException: SI
		 * Esperada excepcion AgendaOcupadaException: No corresponde
		*/
		/*
		 * trabajadorTest123
		 * usando -> servicioPersonalizadoTest1
		 * Tarea con oficio: programador
		 * Trabajador con oficio: programador
		 * Esperada excepcion OficioNoCoincideException: SI
		 * Esperada excepcion AgendaOcupadaException: NO
		 * NOTA: en este caso como no hay excepciones, no hay ninguna salida.
		*/
		/*
		 * trabajadorTest123
		 * Tarea con oficio: programador
		 * Trabajador con oficio: programador
		 * Esperada excepcion OficioNoCoincideException: SI
		 * Esperada excepcion AgendaOcupadaException: SI (misma tarea que TEST CASE 2)
		*/
		System.out.println("TEST CASE 1:");
		trabajadorTest123.asignarTrabajo(servicioPersonalizadoTest2);
		System.out.println("TEST CASE 2:");
		trabajadorTest123.asignarTrabajo(servicioPersonalizadoTest1);
		System.out.println("TEST CASE 3:");
		trabajadorTest123.asignarTrabajo(servicioPersonalizadoTest1);
		System.out.println();
		System.out.println();

		//Prueba de inciso 8
		System.out.println("Prueba de Inciso 8");
		/*
		 * usuarioTest123
		 * nuevo contrato: servicioEstandarTest1
		 * Esperada AlquilerNoEntregadoException: NO
		 * NOTA: en este caso como no hay excepciones, no hay ninguna salida.
		*/
		/*
		 * usuarioTest123
		 * nuevo contrato: servicioPersonalizadoTest1
		 * Esperada AlquilerNoEntregadoException: NO
		 * NOTA: en este caso como no hay excepciones, no hay ninguna salida.
		*/
		/*
		 * usuarioTest123
		 * nuevo contrato: alquilerTest1
		 * Esperada AlquilerNoEntregadoException: NO
		 * NOTA: en este caso como no hay excepciones, no hay ninguna salida.
		*/
		/*
		 * usuarioTest123
		 * nuevos contratos: alquilerTest2, alquilerTest3, alquilerTest4
		 * Esperada AlquilerNoEntregadoException: SI 
		*/
		System.out.println("TEST CASE 1:");
		usuarioTest123.Contratar(servicioEstandarTest1);
		System.out.println("TEST CASE 2:");
		usuarioTest123.Contratar(servicioPersonalizadoTest1);
		System.out.println("TEST CASE 3:");
		usuarioTest123.Contratar(alquilerTest1);
		System.out.println("TEST CASE 3:");
		usuarioTest123.Contratar(alquilerTest2);
		usuarioTest123.Contratar(alquilerTest3);
		usuarioTest123.Contratar(alquilerTest4);
	}

}
