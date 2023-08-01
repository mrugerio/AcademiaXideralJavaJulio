package com.curso.v2;

public class Pikachu extends Observer {
	
	public Pikachu(Subject sub) {
		super(sub);
	}
	
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
