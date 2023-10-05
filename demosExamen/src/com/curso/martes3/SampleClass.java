package com.curso.martes3;

public class SampleClass {

	public static void main(String[] args) {
		
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		
		asc = (AnotherSampleClass)sc;
		
		System.out.println(sc.getClass());
		System.out.println(asc.getClass());

	}

}

class AnotherSampleClass extends SampleClass {}
