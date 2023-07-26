package com.curso.inter;

interface Instrumento {
	void tocarNota();
}

class Guitarra implements Instrumento {
	@Override
	public void tocarNota() {
		System.out.println("¡Strum, strum!");
	}
}

class Piano implements Instrumento {
	@Override
	public void tocarNota() {
		System.out.println("¡Ting, ting!");
	}
}

public class Orquesta {
	public static void main(String[] args) {
		
		Instrumento miInstrumento; 
		miInstrumento = new Guitarra(); 
		miInstrumento.tocarNota(); 

		miInstrumento = new Piano(); 
		miInstrumento.tocarNota(); 
	}
}
