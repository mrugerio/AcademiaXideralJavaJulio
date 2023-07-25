package com.curso.v6;

public class Principal {

	public static void main(String... args) {
		
		Operacion[] operaciones = {new Operacion(),
				new Suma(),
				new Division(),
				new Resta(),
				new Potencia(),
				new Multi()};
		
		for(int x=0; x<operaciones.length;x++) {
			show(operaciones[x]);
		}

	}
	
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope);
		System.out.println(ope.ejecuta(8,4));
	}

}
