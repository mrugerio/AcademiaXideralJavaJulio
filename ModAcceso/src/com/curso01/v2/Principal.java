package com.curso01.v2;

public class Principal {

	public static void main(String[] args) {
		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Lucas");
		Pato pato3 = new Pato("Perikles");
		
		System.out.println(pato3.getNombre());
		
		System.out.println(Pato.getContador()); 
		
		pato1.setNombre("Otro Donald");
		
		System.out.println(pato1.getNombre());

		


	}

}
