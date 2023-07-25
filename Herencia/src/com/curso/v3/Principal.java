package com.curso.v3;

public class Principal {

	public static void main(String... patitos) {

		Suma ope1 = new Suma(8,4);
		Resta ope2 = new Resta(8,4);
		Multi ope3 = new Multi(8,4);
		
		System.out.println(ope1.toString());
		System.out.println(ope1.ejecuta()); //12
		System.out.println(ope2);
		System.out.println(ope2.ejecuta()); //4
		System.out.println(ope3);
		System.out.println(ope3.ejecuta()); //32

	}

}
