package com.curso.domingo.v0;

//MOSTRAR ACCENTURE
public class Test implements SampleCloseable {

	@Override
	public void close() {
		System.out.println("PASO 6!!!");
	}
	
	public static void main(String[] args){
		new Test().close();
	}
}
