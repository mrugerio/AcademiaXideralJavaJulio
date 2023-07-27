package com.curso.sinid.v1;

public class PcMac {

	String version;

	public PcMac(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PcMac [version=" + version + "]";
	}
	
	String on() {
		return "enciende la computadora PcMac " + version;
	}
}
