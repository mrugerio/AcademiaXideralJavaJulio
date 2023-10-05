package com.curso.miercoles4;

class X {
	public X() {
		super();
		System.out.println(1);
	}

	public X(int numero) {
		super();
		System.out.println(2);
	}
}

class Y extends X {
	public Y() {
		super(999);
		System.out.println(3);
	}

	public Y(int numero) {
		super(numero);
		System.out.println(4);
	}
}

class Z extends Y {
	public Z() {
		super();
		System.out.println(5);
	}

	public Z(int z) {
		super(z);
		System.out.println(6);
	}
}

public class Main {
	public static void main(String[] args) {
		X x = new Z(5); //2,4,6
	}
}