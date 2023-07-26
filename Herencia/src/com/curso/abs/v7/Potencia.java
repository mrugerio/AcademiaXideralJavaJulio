package com.curso.abs.v7;

public class Potencia extends Operacion {
	
	@Override
	int ejecuta(int x, int y) {
		this.x = x;
		this.y = y;
		return (int)Math.pow(x, y);
	}

}
