package com.curso.domingo.v1;

public class Bees0 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread( ()->System.out.println("2") );
		t1.start(); //EJECUCION DEL HILO
		
		System.out.println("1"); //PERTENECE AL HILO main

		System.out.println("3"); //PERTENECE AL HILO main
		
		
//		t1.wait(5000);
//		System.out.println("2");
		
	}
	

}
