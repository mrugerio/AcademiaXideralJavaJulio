package com.curso.herencia.v6;

public class AguilaReal extends Aguila {

	
	int x = 10;
	int w = 15;

	static public void volar() {
		System.out.println("Vuelo como Aguila Real");
	}
	
	public static void main(String[] args) {
		//Aguila a = new AguilaReal();
		AguilaReal.volar(); 
	}
	
}
