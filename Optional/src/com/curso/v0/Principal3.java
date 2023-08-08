package com.curso.v0;

import java.util.Optional;

public class Principal3 {
	
	public static void main(String[] args) {
		String nullName = "Tercio";
	    String name = 
	    	Optional.ofNullable(nullName).orElse("john");
	    
	    System.out.println(name);
	}

}
