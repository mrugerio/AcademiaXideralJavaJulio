package com.curso01.v1;

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Pato.contador = contador;
	}	
	
	
	
}
