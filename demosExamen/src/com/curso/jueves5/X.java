package com.curso.jueves5;

public class X {

	public static void main(String[] args) {
		//String theString = "Hello World";
		//System.out.println(theString.charAt(11));
		
		//String[] arreglo = {"Hello","World"};
		//System.out.println(arreglo[2]);
		
		String[] arreglo = {"Hello","World"};
		//System.out.println(arreglo[0].charAt(4));
		
//		System.out.println(arreglo.length); //2
//		System.out.println(arreglo[0].length()); //5

		//System.out.println(arreglo[0].charAt(arreglo[0].length()-1));
		
		String cadena = "Hello World";
		
		int i = cadena.indexOf("x");
		
		System.out.println(i);
		
		char s = cadena.charAt(i);
		
		System.out.println(s);
	}

}
