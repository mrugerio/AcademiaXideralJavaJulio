package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;

		int res;
		try {
			res = calcularDiv(x, y);
			System.out.println("Resultado: " + res);
		} catch (CeroException e) {
			e.printStackTrace();
			//System.out.println("No se puede dividir entre 0");
		}
		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) throws CeroException {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		int z = x / y;
		return z;
	}

}
