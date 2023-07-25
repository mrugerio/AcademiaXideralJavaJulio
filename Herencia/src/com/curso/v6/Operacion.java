package com.curso.v6;

public class Operacion{

	int x;
	int y;
	
	int ejecuta(int x, int y) {
		return 0;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+ "[x=" + x + ", y=" + y + "]";
	}
	

}
