package com.curso.v5;

public class Principal {

	public static void main(String... args) {
		
		Operacion[] operaciones = {new Operacion(8,4),
				new Suma(8,4),
				new Division(8,4),
				new Resta(8,4),
				new Potencia(8,4),
				new Multi(8,4)};
		
		for(int x=0; x<operaciones.length;x++) {
			show(operaciones[x]);
		}

	}
	
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope);
		System.out.println(ope.ejecuta());
	}

}
