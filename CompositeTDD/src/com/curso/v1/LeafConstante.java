package com.curso.v1;

public class LeafConstante implements Component {
	
	double d;

	public LeafConstante(double d) {
		this.d = d;
	}

	@Override
	public double getValor() {
		return d ;
	}

}
