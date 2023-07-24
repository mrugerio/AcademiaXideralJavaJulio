package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Pato pato1 = new Pato("Donald",5);
		
		System.out.println(pato1);
		
		pato1.nadar();
		
		Pato pato2 = new Pato("Lucas",5);
		
		System.out.println(pato2);
		
		pato2.nadar();

	}

}
