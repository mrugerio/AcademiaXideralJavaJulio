package com.curso.v2;

public class Mew extends Observer {
	
	public Mew(Subject sub) {
		super(sub);
	}
	
	void morePower() {
		System.out.println("Mew tiene mas poder");
	}

	@Override
	public void update() {
		morePower();
	}

}
