package com.curso.v0;

public abstract class OperacionImaginarios {
	
	int x;
	int y;

	public OperacionImaginarios(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract int ejecutaImaginarios();
	
}
