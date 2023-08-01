package com.curso.v9;

public class Principal {
	
	
	public static void main(String[] args) {
		
		//TRY WITH RESOURCE
		try (Pato pato1 = new Pato("Donald")) {
			pato1.volar();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
