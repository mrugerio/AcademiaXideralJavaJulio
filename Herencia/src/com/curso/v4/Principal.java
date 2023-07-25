package com.curso.v4;

public class Principal {

	public static void main(String... patitos) {
		
		
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		
		Operacion[] operaciones = {ope0,ope1,ope2,ope3};
		
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
