package com.curso.v2;

public class Pato {
	
	//ATRIBUTO, PROPIEDAD, ESTADO
	String nombre = "Sin nombre";
	int edad; //0
	
	//SOBRECARGA (OVERLOADING)
	Pato(){
		this("Otro nombre",5);
	}

	Pato(String nombre){
		this.nombre = nombre;
	}
	
	Pato(String nombre, int edad) {
		System.out.println("Paso por constructor 3");
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

	
	
}
