package com.curso.v9;

public class Pato implements AutoCloseable {
	
	private String nombre;

	public Pato(String nombre) {
		this.nombre = nombre;
	}
	
	public void volar() throws Exception {
		System.out.println("El pato: "+nombre+" vuela.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("***Cerrar el recurso Pato***");
	}

}
