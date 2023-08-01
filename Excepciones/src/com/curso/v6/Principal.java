package com.curso.v6;

public class Principal {

	public static void main(String[] args) {

		int x = 10;
		int y = 2;

		int res;

		try {
			res = calcularDiv(x, y);
			System.out.println("Resultado: " + res);
		} catch (CeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Paso por finally");
		}

		System.out.println("Fin de Programa");
	}

	private static int calcularDiv(int x, int y) throws CeroException, NegativoException {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		if (y <0 )
			throw new NegativoException("No se permite negativos");
		if (x>100)
			throw new IllegalArgumentException("x no puede ser mayor a 100");
		int z = x / y;
		return z;
	}

}
