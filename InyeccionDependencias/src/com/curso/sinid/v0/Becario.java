package com.curso.sinid.v0;

public class Becario {
	
	String nombre; //has-a (tiene un)
	PcWindows pcWin; //has-a (tiene un)
	
	public Becario(String nombre) {
		this.nombre = nombre;
		pcWin = new PcWindows("Vista");
	}
	
	void encenderPc(){
		System.out.println(nombre + " " +pcWin.on());
	}

}
