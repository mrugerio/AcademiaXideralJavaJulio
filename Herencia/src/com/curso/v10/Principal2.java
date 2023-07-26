package com.curso.v10;

public class Principal2{

	public static void main(String... args) {
		
		Operacion[] operaciones = {
				new Suma(8,4),
				new Division(8,4),
				new Resta(8,4),
				new Potencia(8,4),
				new Multi(8,4)};
		
		show(operaciones);

	}
	
	static void show(Operacion[] ops) {
		//POLIMORFISMO
		for(int x=0; x<ops.length;x++) {
			System.out.println(ops[x]);
			System.out.println(ops[x].ejecuta());
			System.out.println("******");
		}
		
	}

}
