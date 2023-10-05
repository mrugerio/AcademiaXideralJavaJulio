package com.curso.herencia.v3;

public class AguilaReal extends Aguila {
	
	public static void main(String...patitos) {
	System.out.println("Version 3");;;;
	AguilaReal a01 = new AguilaReal(); a01.volar();
	Aguila a02 = new AguilaReal(); a02.volar();
	}
	
	static public void volar() {{
	System.out.println("Vuelo como Aguila Real");}}
	
}
