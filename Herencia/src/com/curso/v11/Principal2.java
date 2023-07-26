package com.curso.v11;

import java.util.ArrayList;
import java.util.List;

public class Principal2{


	public static void main(String... args) {
		
		List<Operacion> operaciones = new ArrayList<>();
		
		operaciones.add(new Suma(8,4));
		operaciones.add(new Division(8,4));
		operaciones.add(new Resta(8,4));
		operaciones.add(new Potencia(8,4));
		operaciones.add(new Multi(8,4));
		
		show(operaciones);

	}
	
	static void show(List<Operacion> ops) {
		for(Operacion o : ops) {
			System.out.println(o);
			System.out.println(o.ejecuta());
			System.out.println("******");
		}
	}
	
	//ADELANTO DE FUNCTIONAL
	static void show1(List<Operacion> ops) {
		ops.forEach(System.out::println);
	}
	
	
//	static void show(List<Operacion> ops) {
//		//POLIMORFISMO
//		for(int x=0; x<ops.size();x++) {
//			System.out.println(ops.get(x));
//			System.out.println(ops.get(x).ejecuta());
//			System.out.println("******");
//		}
//	}

}
