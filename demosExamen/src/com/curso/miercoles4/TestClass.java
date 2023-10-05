package com.curso.miercoles4;

public class TestClass {
	public static void main(String args[]) {
		A b = new B("good bye"); 
		//BUSCAR CONSTRUCTOR B QUE RECIBE UN SOLO STRING
	}
}

class A {
	A() {
		this("hello", " world");
	}

	A(String s) { //AQUI ENTRO 3
		System.out.println(s); //good bye world
		System.out.println("PUNTO3");
	}

	A(String s1, String s2) { //AQUI ENTRO 2
		//YA NO BUSCA AL PAPA
		//BUSCA EN SU MISMA CLASE: A
		this(s1 + s2); //EL RESULTADO DE LA SUMA ES UN STRING
		System.out.println("PUNTO2");
	}
}

class B extends A {
	B() {
		super("good bye");
	};

	//CONSTRUCTOR QUE RECIBE UN SOLO STRING
	B(String s) { //AQUI ENTRO 1
		//BUSCA CONSTRUCTOR DE TU PAPA QUE RECIBA 2 STRING
		super(s, " world"); 
		System.out.println("PUNTO1");
	}

	B(String s1, String s2) {
		this(s1 + s2 + " ! ");
	}
}