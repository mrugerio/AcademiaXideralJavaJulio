package com.curso;

//Primero, creamos la clase abstracta Instrumento.
abstract class Instrumento {
	public abstract void tocarNota();

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}

//Creamos la subclase Guitarra que extiende a Instrumento.
class Guitarra extends Instrumento {
	@Override
	public void tocarNota() {
		System.out.println("¡Strum, strum!");
	}
}

//Creamos la subclase Piano que también extiende a Instrumento.
class Piano extends Instrumento {
	@Override
	public void tocarNota() {
		System.out.println("¡Ting, ting!");
	}
}

//Creamos una clase principal para probar el polimorfismo.
public class Orquesta {
	public static void main(String[] args) {
		
		Instrumento miInstrumento; // Declaramos una sola referencia de tipo Instrumento.

		miInstrumento = new Guitarra(); // Ahora, miInstrumento es una Guitarra.
		System.out.println(miInstrumento);
		miInstrumento.tocarNota(); // Llama al método tocarNota() de la Guitarra.

		miInstrumento = new Piano(); // Ahora, miInstrumento es un Piano.
		System.out.println(miInstrumento);
		miInstrumento.tocarNota(); // Llama al método tocarNota() del Piano.
	}
}
