package com.curso.v6;

public class Potencia extends Operacion {
	
	@Override
	int ejecuta(int x, int y) {
		return (int)Math.pow(x, y);
	}

}
