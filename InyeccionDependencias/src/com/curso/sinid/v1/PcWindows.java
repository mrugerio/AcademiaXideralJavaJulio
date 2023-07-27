package com.curso.sinid.v1;

public class PcWindows {

	String version;

	public PcWindows(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PcWindwos [version=" + version + "]";
	}
	
	String on() {
		return "enciende la computadora PcWindows " + version;
	}
}
