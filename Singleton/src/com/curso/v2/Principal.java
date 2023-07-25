package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Conexion c1 = Conexion.getInstance();
		Conexion c2 = Conexion.getInstance();
		Conexion c3 = Conexion.getInstance();
		Conexion c4 = Conexion.getInstance();
		Conexion c999 = Conexion.getInstance();
		
		System.out.println(Conexion.getContador()); //1
		
	}

}
