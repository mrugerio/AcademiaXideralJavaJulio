package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Pato pato1 = new Pato("Donald");
		
		System.out.println(pato1.nombre);
		
		Pato pato2 = new Pato();
		
		System.out.println(pato2.nombre);

	}

}
