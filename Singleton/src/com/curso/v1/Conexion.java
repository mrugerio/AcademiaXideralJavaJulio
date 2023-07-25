package com.curso.v1;

public class Conexion {
	
	private static Conexion conn;
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
		
		if (conn==null)
			conn = new Conexion("Mysql");
		
		return conn;
	}

}
