package com.curso.martes3;

class X {

	X() {
	}

	protected void one() {
	}

}

public class Y extends X {

	Y() {
	}

	private void two() {

		one();

	}

	public static void main(String[] args) {

		new Y().two();

	}

}