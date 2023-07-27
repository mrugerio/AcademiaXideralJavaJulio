package com.curso.conid.v3;

public class Inyector {
	
	static void inyectarPc(Becario bec, String tipo) {
		if (tipo=="win") 
			bec.pc = new PcWindows("Vista");
		else if (tipo=="lin")
			bec.pc = new PcLinux("Ubuntu 18");
		else 
			bec.pc = new PcMac("Sierra");
	}

}
