package com.curso01.v3;

public class Pato {
	
	private String nombre; 
	private static int contador; 
	
	public Pato(String nombre) {
		this.nombre = nombre;
		++contador; 
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + "]";
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected static int getContador() {
		return contador;
	}

	protected static void setContador(int contador) {
		Pato.contador = contador;
	}	
	
	
	
}
