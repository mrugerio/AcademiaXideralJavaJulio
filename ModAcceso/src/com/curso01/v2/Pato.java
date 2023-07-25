package com.curso01.v2;

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

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	static int getContador() {
		return contador;
	}

	static void setContador(int contador) {
		Pato.contador = contador;
	}	
	
	
	
}
