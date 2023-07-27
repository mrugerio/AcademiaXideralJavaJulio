package com.curso.conid.v6;

public class Inyector {
	
	static void inyectarPc(Becario bec, String tipo) {
		if (tipo=="win") 
			bec.setPc(new PcWindows("Vista"));
		else if (tipo=="lin")
			bec.setPc(new PcLinux("Ubuntu 18"));
		else 
			bec.setPc(new PcMac("Sierra"));
	}

}
