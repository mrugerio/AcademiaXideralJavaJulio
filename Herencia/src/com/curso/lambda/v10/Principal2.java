package com.curso.lambda.v10;

public class Principal2{

	public static void main(String... args) {
		
		Operacion[] operaciones = {
				(x,y) -> x+y,
				(x,y) -> x-y,
				(x,y) -> x*y,
				(x,y) -> x/y,
				(x,y) -> (int) Math.pow(x, y)
		};
		System.out.println("**Lambdas**");
		show(operaciones);

	}
	
	static void show(Operacion[] ops) {
		//POLIMORFISMO
		for(int x=0; x<ops.length;x++) {
			System.out.println(ops[x].ejecuta(8,4));
			System.out.println("******");
		}
		
	}

}
