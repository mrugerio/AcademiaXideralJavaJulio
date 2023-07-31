package com.curso.v1;

public class Arcanine implements Observer {
	
	void quitarArma(String arma) {
		System.out.println("Arcanine se le quita arma: "+arma);
	}

	@Override
	public void update() {
		quitarArma("Espada");
	}

}
