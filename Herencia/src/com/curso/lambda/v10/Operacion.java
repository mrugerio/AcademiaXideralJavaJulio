package com.curso.lambda.v10;

@FunctionalInterface
public interface Operacion{

	//Only one abstract method
	int ejecuta(int x, int y);
	
	//Many method: static
	//Many method: default
}
