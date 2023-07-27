package com.curso.conid.v3;

public class PcLinux implements Pc  {

	String version;

	public PcLinux(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PcLinux [version=" + version + "]";
	}
	
	public String on() {
		return "enciende la computadora PcLinux " + version;
	}
}
