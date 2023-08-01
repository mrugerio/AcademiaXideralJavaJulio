package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
		
		try {
			int res = calcularDiv(x,y);
			System.out.println("Resultado: "+res);
		}catch(ArithmeticException e) {
			System.out.println("**Se genero una ArithmeticException**");
		}
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) {
		int z = x/y;
		return z;
	}

}
