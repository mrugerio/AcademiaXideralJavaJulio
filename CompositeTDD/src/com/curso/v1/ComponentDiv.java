package com.curso.v1;

public class ComponentDiv implements Component {
	
	Component compLeft,compRight;

	public ComponentDiv(Component compLeft, Component compRight) {
		this.compLeft = compLeft;
		this.compRight = compRight;
	}

	@Override
	public double getValor() {
		return compLeft.getValor() / compRight.getValor();
	}

}
