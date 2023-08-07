package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Component comp01 = new LeafConstante(8.0);
		
		double res = comp01.getValor();
		
		System.out.println(res);
		
		Component comp02 = new LeafConstante(16.0);

		res = comp02.getValor();
		
		System.out.println(res);
		
	}

}
