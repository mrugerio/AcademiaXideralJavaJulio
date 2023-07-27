package com.curso.conid.v5;

public class PcWindows implements Pc {

	String version;

	public PcWindows(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PcWindwos [version=" + version + "]";
	}
	
	public String on() {
		return "enciende la computadora PcWindows " + version;
	}
}
