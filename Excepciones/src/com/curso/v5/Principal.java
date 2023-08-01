package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = -4;

		int res;

		try {
			res = calcularDiv(x, y);
			System.out.println("Resultado: " + res);
		} catch (CeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		}
		

		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) throws CeroException, NegativoException {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		if (y <0 )
			throw new NegativoException("No se permite negativos");
		int z = x / y;
		return z;
	}

}
