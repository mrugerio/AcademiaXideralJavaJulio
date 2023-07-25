package com.curso.v6;

public class Principal2{

	public static void main(String... args) {
		
		Operacion[] operaciones = {new Operacion(),
				new Suma(),
				new Division(),
				new Resta(),
				new Potencia(),
				new Multi()};
		
		Principal2 prin2 = new Principal2();
		prin2.show(operaciones);

	}
	
	void show(Operacion[] ops) {
		//POLIMORFISMO
		for(int x=0; x<ops.length;x++) {
			System.out.println(ops[x]);
			System.out.println(ops[x].ejecuta(8,4));
		}
		
	}

}
