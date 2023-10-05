package com.curso.domingo.v1;

public class Bees1 {
	
	public static void main(String[] args) {
		try {
			new Bees1().go();
		} catch (Exception e) {
			System.out.println("thrown to main");
		}
	}
	
	synchronized void go() throws InterruptedException {
		Thread t1 = new Thread();
		t1.start(); 
		
		System.out.println("1");
		t1.wait(5000); //LANZA LA EXCEPTION
		System.out.println("2");
	}
	
}
