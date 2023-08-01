package com.curso.v2;

public class EstadoJuego extends Subject {
	
	void actualizarVersion()  {
		
		System.out.println("Empieza a actualizar Versión del Juego");	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		notificar();
		
		System.out.println("Fin actualización del Video Juego");
	}

}
