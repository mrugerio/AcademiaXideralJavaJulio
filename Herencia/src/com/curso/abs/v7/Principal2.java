package com.curso.abs.v7;

public class Principal2{

	public static void main(String... args) {
		
		Operacion[] operaciones = {
				new Suma(),
				new Division(),
				new Resta(),
				new Potencia(),
				new Multi()};
		
		show(operaciones);

	}
	
	static void show(Operacion[] ops) {
		//POLIMORFISMO
		for(int x=0; x<ops.length;x++) {
			System.out.println(ops[x].ejecuta(8,4));
			System.out.println(ops[x]);
			System.out.println("******");
		}
		
	}

}
