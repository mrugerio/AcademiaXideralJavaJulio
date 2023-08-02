package com.curso.lambda.v11;

public class Principal2{

	public static void main(String... args) {
		
		Operacion op1 = (a,b,s) -> { 
			System.out.println(s);
			return a+b;
		};
		
		
		Operacion op2 = (x,y,z) ->{ 
			System.out.println(z);
			return x-y;
		};
		
		int res = op1.ejecuta(5, 8, "Suma");
		System.out.println(res);
		res = op2.ejecuta(7, 3, "Resta");
		System.out.println(res);



		
	}
		


}
