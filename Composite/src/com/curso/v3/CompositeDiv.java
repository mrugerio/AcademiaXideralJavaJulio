package com.curso.v3;

                           //IS-A
public class CompositeDiv implements Component {
	
	//HAS-A
	private Component compLeft;
	private Component compRight;

	public CompositeDiv(Component compLeft, Component compRight) {
		this.compLeft = compLeft;
		this.compRight = compRight;
	}


	@Override
	public double getValor() {
		return compLeft.getValor() / compRight.getValor() ;
	}

}
