package com.curso.v1;

                           //IS-A
public class CompositeSuma implements Component {
	
	//HAS-A
	private Component compRight;
	private Component compLeft;

	public CompositeSuma(Component compRight, Component compLeft) {
		this.compRight = compRight;
		this.compLeft = compLeft;
	}

	@Override
	public double getValor() {
		return compRight.getValor() + compLeft.getValor() ;
	}

}
