package com.curso.v2;

public class Conexion {
	
	private static Conexion conn = new Conexion("Mysql");
	String nombre;
	static int contador;
	
	private Conexion(String nombre) {
		System.out.println("Paso por Constructor");
		this.nombre = nombre;
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}
	
	public static Conexion getInstance() {
		return conn;
	}

}
