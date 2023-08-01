package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		EstadoJuego estadoJuego = new EstadoJuego();

		Observer obs1 = new Pikachu(estadoJuego);
		Observer obs2 = new Mew(estadoJuego);
		
		estadoJuego.actualizarVersion();
		
		System.out.println("**********");
		
		Observer obs4 = new Arcanine(estadoJuego);
		Observer obs3 = new Machop(estadoJuego);
		estadoJuego.detach(obs1);

		estadoJuego.actualizarVersion();

		System.out.println("**********");

		
		
	}

}
