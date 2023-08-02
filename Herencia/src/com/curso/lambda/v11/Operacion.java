package com.curso.lambda.v11;

@FunctionalInterface
public interface Operacion{

	//Only one abstract method
	int ejecuta(int x, int y, String name);
	
	//Many method: static
	//Many method: default
}
