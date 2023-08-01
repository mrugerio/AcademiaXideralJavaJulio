package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = -2;
		
		try {
			int res = calcularDiv(x,y);
			System.out.println("Resultado: "+res);
		}catch(ArithmeticException e) {
			System.out.println("**Se genero una ArithmeticException**");
		}catch(Exception e) {
			System.out.println("**Se genero una Exception**");
		}finally {
			System.out.println("Paso por Finally");
		}
		
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) {
		if (y < 0)
			throw new IllegalArgumentException("No se permite negativo");
		int z = x/y;
		return z;
	}

}
