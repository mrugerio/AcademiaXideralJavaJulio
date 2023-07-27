package com.curso.conid.v4;

public class PcMac implements Pc {

	String version;

	public PcMac(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PcMac [version=" + version + "]";
	}
	
	public String on() {
		return "enciende la computadora PcMac " + version;
	}
}
