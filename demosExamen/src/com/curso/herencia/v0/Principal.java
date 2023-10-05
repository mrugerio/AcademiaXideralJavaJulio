package com.curso.herencia.v0;

public class Principal {

	//METODOS DE INSTACIA (SobreEscritura)
	public static void main(String[] args) {
		AguilaReal a01 = new AguilaReal();
		a01.volar(); //Volar como Aguila Real
		
		Aguila a02 = new AguilaReal();
		a02.volar(); //Volar como Aguila Real
				
	}

}
