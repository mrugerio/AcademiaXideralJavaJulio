package com.curso.v8;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Pato pato1 = new Pato("Donald");
		
		try {
			pato1.volar();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//OPCIONAL
			pato1.close();
		}
		
		
	}

}
