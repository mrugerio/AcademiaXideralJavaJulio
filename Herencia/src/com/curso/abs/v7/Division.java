package com.curso.abs.v7;

public class Division extends Operacion {
	
	@Override
	int ejecuta(int x, int y) {
		this.x = x;
		this.y = y;
		return x/y;
	}

}
