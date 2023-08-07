package com.curso.v3;

                           //IS-A
public class CompositeMulti implements Component {
	
	//HAS-A
	private Component compLeft;
	private Component compRight;

	public CompositeMulti(Component compLeft, Component compRight) {
		this.compLeft = compLeft;
		this.compRight = compRight;
	}


	@Override
	public double getValor() {
		return compLeft.getValor() * compRight.getValor() ;
	}

}
