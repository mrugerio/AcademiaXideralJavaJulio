package com.curso.abs.v7;

public abstract class Operacion{
	
	//VARIABLES DE INSTANCIA DE CLASE
	int x;
	int y;
	
	abstract int ejecuta(int x, int y);
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+ "[x=" + x + ", y=" + y + "]";
	}
	

}
