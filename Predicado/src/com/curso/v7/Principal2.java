package com.curso.v7;

import java.util.function.Predicate;
import java.util.function.Function;


public class Principal2 {

	public static void main(String[] args) {
		
		//Vamos a evaluar una lambda Predicate donde vamos a pasar 
		//un valor entero y la lambda va a evaluar si es un un número par (true)
		//o impar (false)
		
		Predicate<Integer> pre = i -> (i%2==0) ? true : false ;
		
		boolean r = pre.test(6);
		
		if (r)
			System.out.println("Es par");
		else 
			System.out.println("Es impar");
		
		System.out.println("**********");
		
		Function<Integer,String> fun = i -> (i%2==0) ? "Es par" : "Es impar" ;
		
		System.out.println(fun.apply(8));

	}
	
	static void mostrarEmpleados(String[] arreglo, Predicate<String> pe ) {
		

		
	}
	
	
	
	
	
	

}
