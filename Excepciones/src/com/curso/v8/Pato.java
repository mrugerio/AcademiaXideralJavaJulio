package com.curso.v8;

public class Pato {
	
	private String nombre;

	public Pato(String nombre) {
		this.nombre = nombre;
	}
	
	public void close() {
		System.out.println("Cerrar el recurso Pato");
	}
	
	public void volar() throws Exception {
		System.out.println("El pato: "+nombre+" vuela.");
	}

}
