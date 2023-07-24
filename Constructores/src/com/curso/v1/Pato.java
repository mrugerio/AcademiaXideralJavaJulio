package com.curso.v1;

public class Pato {
	
	//ATRIBUTO, PROPIEDAD, ESTADO
	String nombre = "Sin nombre";
	int edad; //0
	
	//CONSTRUCTOR DEFAULT
	Pato(){
	}

	Pato(String nombre){
		this.nombre = nombre;
	}
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

	
	
}
