package com.curso.sinid.v1;

public class Principal {

	public static void main(String[] args) {
		Becario bec1 = new Becario("Andronico");
		bec1.encenderPc("win");
		
		Becario bec2 = new Becario("Patrobas");
		bec2.encenderPc("lin");
		
		Becario bec3 = new Becario("Epeneto");
		bec3.encenderPc("mac");
	}

}
