package com.curso.v0;

import java.util.Optional;

public class Principal4 {

	public static void main(String[] args) {

		String nullName = null;
	    String name = Optional.ofNullable(nullName)
	    						.orElseGet(() -> "john");
		System.out.println(name);
		
	}

}
