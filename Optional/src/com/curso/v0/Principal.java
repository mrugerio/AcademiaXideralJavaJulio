package com.curso.v0;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		boolean res = empty.isPresent();
		//System.out.println(res);
		
		String name = "baeldung";
	    Optional<String> opt = Optional.of(name);
	    res = opt.isPresent();
		System.out.println(opt.get());
		
		name = null;
		try {
			Optional.of(name);
		}
		catch(NullPointerException e) {
			System.out.println("Se genero un NullPointerException");
		}
		
	    System.out.println("FIN DE PROGRAMA");

	}

}
