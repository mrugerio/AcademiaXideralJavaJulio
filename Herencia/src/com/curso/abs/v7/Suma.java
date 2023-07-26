package com.curso.abs.v7;

public class Suma extends Operacion {

	@Override
	int ejecuta(int x, int y) {
		this.x = x;
		this.y = y;
		//variable locales
		return x+y;
	}

}
