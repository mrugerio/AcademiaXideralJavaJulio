package com.curso.v0;

public class Conexion {
	
	String nombre;
	static int contador;
	
	public Conexion(String nombre) {
		this.nombre = nombre;
		contador++;
	}
	
	static int getContador() {
		return contador;
	}
	
	

}
