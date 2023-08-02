package com.curso.v7;

import java.util.function.Predicate;

public class Principal1 {

	public static void main(String[] args) {
		
		System.out.println("Version 7 String");
		boolean res;

		String[] array = {"Patrobas","Tercio","Andronico","Epeneto"};
		
		System.out.println("Longitud de nombre mayor a 7?");
		mostrarEmpleados(array, s -> s.length() > 7 );


	}
	
	static void mostrarEmpleados(String[] arreglo, Predicate<String> pe ) {
		
		for (String nombre : arreglo) {
			System.out.println(nombre);
			//EJECUCION DE LA LAMBDA
			System.out.println(pe.test(nombre));
		} 
		
	}
	
	
	
	
	
	

}
