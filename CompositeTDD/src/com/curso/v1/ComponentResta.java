package com.curso.v1;

public class ComponentResta implements Component {
	
	Component compLeft,compRight;

	public ComponentResta(Component compLeft, Component compRight) {
		this.compLeft = compLeft;
		this.compRight = compRight;
	}

	@Override
	public double getValor() {
		return compLeft.getValor() - compRight.getValor();
	}

}
