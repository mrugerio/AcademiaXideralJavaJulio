package com.curso.v6;

public class Principal1 {

	public static void main(String[] args) {
		
		System.out.println("Version 6 String");
		boolean res;

		String[] array = {"Patrobas","Tercio","Andronico","Epeneto"};
		
		System.out.println("Longitud de nombre mayor a 7?");
		mostrarEmpleados(array, s -> s.length() > 7 );


	}
	
	static void mostrarEmpleados(String[] arreglo, Predicado<String> pe ) {
		
		for (String nombre : arreglo) {
			System.out.println(nombre);
			//EJECUCION DE LA LAMBDA
			System.out.println(pe.probar(nombre));
		} 
		
	}
	
	
	
	
	
	

}
