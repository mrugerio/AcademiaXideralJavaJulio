package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Observer obs1 = new Pikachu();
		Observer obs2 = new Mew();
		Observer obs3 = new Machop();

		EstadoJuego estadoJuego = new EstadoJuego();
		
		estadoJuego.attach(obs1);
		estadoJuego.attach(obs2);
		estadoJuego.attach(obs3);

		estadoJuego.actualizarVersion();
		
		System.out.println("**********");
		
		Observer obs4 = new Arcanine();
		estadoJuego.attach(obs4);
		estadoJuego.detach(obs1);
		estadoJuego.detach(obs3);

		estadoJuego.actualizarVersion();

		System.out.println("**********");

		
		
	}

}
