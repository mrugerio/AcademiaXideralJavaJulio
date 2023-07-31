package com.curso.v1;

public class Pikachu implements Observer {
	
	void cambiarColor() {
		System.out.println("Pikachu cambia de azul a rojo");
	}

	@Override
	public void update() {
		cambiarColor();
		cambiarAltura();
	}
	
	void cambiarAltura() {
		System.out.println("Pikachu incrementa altura de 1 metro");
	}

}
