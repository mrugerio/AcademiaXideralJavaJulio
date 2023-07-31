package com.curso.v0;

public class EstadoJuego {
	
	Pikachu pikachu = new Pikachu();
	Machop machop = new Machop();
	Mew mew = new Mew();

	
	void actualizarVersion() {
		
		System.out.println("Empieza a actualizar Versión del Juego");
		
		pikachu.cambiarColor();
		mew.morePower();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		machop.asignarArma("Rayo Laser");
		
		System.out.println("Fin actualización del Video Juego");
	}

}
