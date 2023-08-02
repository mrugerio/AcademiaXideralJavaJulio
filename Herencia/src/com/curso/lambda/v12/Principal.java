package com.curso.lambda.v12;

import java.util.function.IntBinaryOperator;

public class Principal{

	public static void main(String... args) {
		
		IntBinaryOperator[] operaciones = {
				(x,y) -> x+y,
				(x,y) -> x-y,
				(x,y) -> x*y,
				(x,y) -> x/y,
				(x,y) -> (int) Math.pow(x, y)
		};
		System.out.println("**Lambdas IntBinaryOperator**");
		show(operaciones);

	}
	
	static void show(IntBinaryOperator[] ops) {
		//POLIMORFISMO
		for(int x=0; x<ops.length;x++) {
			System.out.println(ops[x].applyAsInt(8,4));
			System.out.println("******");
		}
		
	}

}
