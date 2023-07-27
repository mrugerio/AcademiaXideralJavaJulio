package com.curso.sinid.v1;

public class PcLinux {

	String version;

	public PcLinux(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PcLinux [version=" + version + "]";
	}
	
	String on() {
		return "enciende la computadora PcLinux " + version;
	}
}
