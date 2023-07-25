package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Conexion c1 = new Conexion("Mysql");
		Conexion c2 = new Conexion("Mysql");
		Conexion c3 = new Conexion("Mysql");
		Conexion c4 = new Conexion("Mysql");

		System.out.println(Conexion.getContador()); //4
		
	}

}
