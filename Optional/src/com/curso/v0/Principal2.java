package com.curso.v0;

import java.util.Optional;

public class Principal2 {

	public static void main(String[] args) {

		String name = null;
		
		sinOptional(name);
		conOptional(name);
		
		System.out.println("Fin de programa");
		
	}
	
	static void sinOptional(String name) {
		if(name != null) 
		    System.out.println(name.length());
	}
	
	static void conOptional(String name) {
		Optional<String> opt = Optional.ofNullable(name);
	    opt.ifPresent(nombre -> System.out.println(nombre.length()));
	}

}
