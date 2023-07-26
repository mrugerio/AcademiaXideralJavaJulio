package com.curso.interf.v9;

public class Resta implements Operacion {
	
	int x;
	int y;

	public Resta(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return x-y;
	}

}
