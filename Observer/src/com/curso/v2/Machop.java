package com.curso.v2;

public class Machop extends Observer {
	
	public Machop(Subject sub) {
		super(sub);
	}
	
	void asignarArma(String arma) {
		System.out.println("Machop asignar arma: "+arma);
	}

	@Override
	public void update() {
		asignarArma("Rayo laser");
	}

}
