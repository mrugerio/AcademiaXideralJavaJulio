package com.curso.v2;

public class Arcanine extends Observer {
	
	public Arcanine(Subject sub) {
		super(sub);
	}
	
	void quitarArma(String arma) {
		System.out.println("Arcanine se le quita arma: "+arma);
	}

	@Override
	public void update() {
		quitarArma("Espada");
	}

}
