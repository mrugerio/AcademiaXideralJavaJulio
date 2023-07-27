package com.curso.conid.v5;

public class Inyector {
	
	public static Becario getBecario(String nombre, TipoPc tipo) {
		
		switch (tipo) {
        case WINDOWS:
        	return new Becario(nombre,new PcWindows("Vista"));
        case LINUX:
        	return new Becario(nombre,new PcLinux("Ubuntu"));
        default: 
        	return new Becario(nombre,new PcMac("Sierra"));
		}	
		
	}
}
