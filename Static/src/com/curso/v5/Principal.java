package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		Pato pato1 = new Pato("Donald");		
		Pato pato2 = new Pato("Lucas");
		Pato pato3 = new Pato("Perikles");
		
		System.out.println(Pato.getContador()); //3
		

	}

}
