package com.curso;

class ClassA {}
class ClassB extends ClassA {}
class ClassC extends ClassA {}

class Principal{
	
	public static void main(String[] args) {
		
		ClassA p0 = new ClassA();
		ClassB p1 = new ClassB();
		ClassC p2 = new ClassC();
		ClassA p3 = new ClassB();
		ClassA p4 = new ClassC();

		p0 = p3;
		p2 = (ClassC)p0;
		System.out.println(p2);

		
	}
	
}


