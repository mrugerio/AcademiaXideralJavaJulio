package com.curso.v2;

public class Multi extends Operacion {
	
	public Multi(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return x*y;
	}
	
	@Override
	public String toString() {
		return "Multi [x=" + x + ", y=" + y + "]";
	}
	

}
