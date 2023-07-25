package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Lucas");
		Pato pato3 = new Pato("Perikles");
		
		System.out.println(pato1.contador); //1
		System.out.println(pato2.contador); //1
		System.out.println(pato3.contador); //1


	}

}
