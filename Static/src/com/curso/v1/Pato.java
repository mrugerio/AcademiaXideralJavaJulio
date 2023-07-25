package com.curso.v1;

public class Pato {
	
	//VARIABLES DE INSTANCIA DE CLASE
	String nombre; //null
	int contador; //0
	
	Pato(String nombre) {
		this.nombre = nombre;
		++contador; //contador = contador + 1
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + "]";
	}	
	
}
