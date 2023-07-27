package com.curso.conid.v5;

public class Principal {

	public static void main(String[] args) {
		
		Becario bec0 = Inyector.getBecario("Tercio", TipoPc.MAC);
		bec0.encenderPc();
		
		Becario bec1 = Inyector.getBecario("Andronico", TipoPc.MAC);
		bec1.encenderPc();
		
		Becario bec2 = Inyector.getBecario("Patrobas", TipoPc.WINDOWS);
		bec2.encenderPc();
		
		Becario bec3 = Inyector.getBecario("Epeneto", TipoPc.LINUX);
		bec3.encenderPc();
		
	}

}
