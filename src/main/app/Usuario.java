package main.app;

import java.util.ArrayList;

import main.bien.Alquiler;
import main.bien.Herramienta;
import main.excepcion.AlquilerNoEntregadoException;
import main.negocio.Contratable;

public class Usuario {
	ArrayList<Contratable> listaDeContratados = new ArrayList<>();
		
	private void cuentaConMasDeDos() throws AlquilerNoEntregadoException {
		int contadorDeAlquileres = 0;
		for(Contratable contratable : listaDeContratados) {
			if(contratable instanceof Alquiler) contadorDeAlquileres++;
			if(contadorDeAlquileres > 2) throw new AlquilerNoEntregadoException();
		}
	}
	
	public void Contratar(Contratable nuevoContratado) {
		try {
			cuentaConMasDeDos();
			listaDeContratados.add(nuevoContratado);
		}
		catch(AlquilerNoEntregadoException e) {
			System.out.println(e.toString());
		}
	}
}
