package com.curso.v2;

                           //IS-A
public class CompositeSuma implements Component {
	
	//HAS-A
	private Component compLeft;
	private Component compRight;

	public CompositeSuma(Component compLeft, Component compRight) {
		this.compLeft = compLeft;
		this.compRight = compRight;
	}


	@Override
	public double getValor() {
		return compLeft.getValor() + compRight.getValor() ;
	}

}
