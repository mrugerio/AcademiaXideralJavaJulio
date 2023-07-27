package com.curso.conid.v3;

public class Principal {

	public static void main(String[] args) {
		
		Becario bec0 = new Becario("Tercio");
		Inyector.inyectarPc(bec0, "mac");
		bec0.encenderPc();
		
		Becario bec1 = new Becario("Andronico");
		Inyector.inyectarPc(bec1, "mac");
		bec1.encenderPc();
		
		Becario bec2 = new Becario("Patrobas");
		Inyector.inyectarPc(bec2, "win");
		bec2.encenderPc();
		
		Becario bec3 = new Becario("Epeneto");
		Inyector.inyectarPc(bec3, "lin");
		bec3.encenderPc();
		
	}

}
