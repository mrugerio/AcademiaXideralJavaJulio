package com.curso.v3;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Animal animal = new Perro();
		animal.getSound();
		
		animal = new Pato();
		animal.getSound();
		
//		animal = new Animal();
//		animal.getSound();

		System.out.println("*************");
		
		animal = getAnimal();
		animal.getSound();

	}

	private static Animal getAnimal() {
		Animal[] animals = {new Gallina(),new Gato(),new Perro(),new Pato()};
		int num = new Random().nextInt(animals.length);
		return animals[num];
	}

}
