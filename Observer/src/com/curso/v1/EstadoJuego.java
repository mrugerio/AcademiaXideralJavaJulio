package com.curso.v1;

public class EstadoJuego extends Subject {
	
	void actualizarVersion() {
		
		System.out.println("Empieza a actualizar Versión del Juego");
				
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		notificar();
		
		System.out.println("Fin actualización del Video Juego");
	}

}
