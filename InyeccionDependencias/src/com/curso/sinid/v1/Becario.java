package com.curso.sinid.v1;

public class Becario {
	
	String nombre; //has-a (tiene un)
	PcWindows pcWin; //has-a (tiene un)
	PcLinux pcLin;
	PcMac pcMac;
	
	public Becario(String nombre) {
		this.nombre = nombre;
		//ALTO ACOPLAMIENTO (BAJA COHESION)
		pcWin = new PcWindows("Vista");
		pcLin = new PcLinux("Ubuntu 18");
		pcMac = new PcMac("Sierra");
	}
	
	void encenderPc(String tipo){
		if (tipo=="win")
			System.out.println(nombre + " " +pcWin.on());
		else if(tipo=="lin") 
			System.out.println(nombre + " " +pcLin.on());
		else 
			System.out.println(nombre + " " +pcMac.on());
		
	}

}
