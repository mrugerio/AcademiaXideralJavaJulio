package com.curso.v1;

public class Machop implements Observer {
	
	void asignarArma(String arma) {
		System.out.println("Machop asignar arma: "+arma);
	}

	@Override
	public void update() {
		asignarArma("Rayo laser");
	}

}
