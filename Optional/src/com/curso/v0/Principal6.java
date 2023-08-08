package com.curso.v0;

import java.util.Optional;

public class Principal6 {

	public static void main(String[] args) {

		String password = " password ";
	    Optional<String> passOpt = Optional.of(password);
	    
	    boolean correctPassword = passOpt
	    		.filter(pass -> pass.equals("password"))
	    		.isPresent();
	    
	    System.out.println(correctPassword); //FALSE

	    correctPassword = passOpt
	    		.map(String::trim)
	    		.filter(pass -> pass.equals("password"))
	    		.isPresent();
	    
	    System.out.println(correctPassword);

		
	}

}
