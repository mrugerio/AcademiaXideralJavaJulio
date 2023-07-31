package com.curso.v1;

public class Mew implements Observer {
	
	void morePower() {
		System.out.println("Mew tiene mas poder");
	}

	@Override
	public void update() {
		morePower();
	}

}
