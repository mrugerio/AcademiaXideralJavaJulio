package com.curso.v3;

public class Pato {
	
	{
		System.out.println("Paso 2");
	}
	
	String nombre ;
	int edad;
	
	Pato(String nombre, int edad) {
		System.out.println("Paso por el constructor");
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	{
		System.out.println("Paso 1");
	}
	
	void nadar() {
		System.out.println("El pato "+nombre+" no sabe nadar");
		
	}
	
	
}
