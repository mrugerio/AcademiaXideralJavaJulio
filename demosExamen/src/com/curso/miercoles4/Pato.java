package com.curso.miercoles4;

public class Pato {
	
	protected String nombre;
	
	protected Pato(){
		System.out.println("Constructor Pato");
	}
	
	protected void volar() {
		System.out.println(nombre + " esta volando.");
	}

}
