package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Component comp01 = new LeafConstante(8.0);
		Component comp02 = new LeafConstante(16.0);

		Component comp03 = new CompositeSuma(comp01,comp02);
		
		//System.out.println(comp03.getValor());
		
		Component comp04 = new LeafConstante(5.0);
		
		Component comp05 = new CompositeSuma(comp04,comp03); //29
		
		//System.out.println(comp05.getValor());
		
		Component comp06 = new CompositeSuma(comp05,
				new CompositeSuma(new LeafConstante(3.0),new LeafConstante(4.0))
				);
		
		System.out.println(comp06.getValor());
		
	}

}
