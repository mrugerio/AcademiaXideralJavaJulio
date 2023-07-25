package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Pato.contador); //0
		
		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Lucas");
		System.out.println(Pato.contador); //2

		Pato pato3 = new Pato("Perikles");
		
		System.out.println(Pato.contador); //3
		
//		System.out.println(pato1.contador); //3
//		System.out.println(pato2.contador); //3
//		System.out.println(pato3.contador); //3


	}

}
