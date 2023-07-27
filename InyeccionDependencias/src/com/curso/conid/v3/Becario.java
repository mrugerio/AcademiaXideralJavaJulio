package com.curso.conid.v3;

//BAJO ACOPLAMIENTO
//ALTA COHESION
public class Becario {
	
	String nombre; //has-a (tiene un)
	Pc pc; //has-a (tiene un)
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderPc(){
		System.out.println(nombre + " " +pc.on());
	}

}
