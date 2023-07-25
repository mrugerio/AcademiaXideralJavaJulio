package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Pato.getContador()); //0
		
		Pato pato1 = new Pato("Donald");		
		Pato pato2 = new Pato("Lucas");
		System.out.println(Pato.getContador()); //2

		Pato pato3 = new Pato("Perikles");
		
		System.out.println(Pato.getContador()); //3
		

	}

}
