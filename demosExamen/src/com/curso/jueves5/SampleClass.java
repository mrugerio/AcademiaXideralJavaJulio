package com.curso.jueves5;

public class SampleClass {
	
	public static void main(String[] args) {
		
		SampleClass sc, scA, scB;
		
		sc = new SampleClass();
//		System.out.println(sc.getHash()); //11111111
		
		scA = new SampleClassA();
//		System.out.println(scA.getHash()); //44444444
		
		scB = new SampleClassB();
//		System.out.println(scB.getHash()); //999999999
		
		System.out.println(sc.getHash()+", "+scA.getHash()+", "+
				scB.getHash());
    
	}
	public int getHash() {
		return 111111111;
	}
}

class SampleClassA extends SampleClass {
	public int getHash() {
		return 444444444;
	}
}

class SampleClassB extends SampleClass {
	public int getHash() {
		return 999999999;
	}
}
