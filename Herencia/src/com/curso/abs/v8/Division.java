package com.curso.abs.v8;

public class Division extends Operacion {

	public Division(int x, int y) {
		super(x, y);
	}

	@Override
	int ejecuta() {
		return x/y;
	}

}
