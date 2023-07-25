package com.curso.v5;

public class Pato {
	
	//VARIABLES DE INSTANCIA DE CLASE
	String nombre; //null
	
	//VARIABLE DE CLASE
	static int contador; //0
	
	Pato(String nombre) {
		System.out.println("Paso por constructor");
		this.nombre = nombre;
		++contador; //contador = contador + 1
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + "]";
	}	
	
	static {
		System.out.println("Paso por bloque");
	}

	//METODO DE CLASE
	static int getContador() {
		return contador;
	}
	
	//NO SE PUEDE
//	static String getNombre() {
//		return nombre;
//	}

}
