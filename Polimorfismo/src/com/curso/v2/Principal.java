package com.curso.v2;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Gato gato = new Gato();
		gato.getSound();
		
		System.out.println("*************");
		
		Animal animal = new Perro();
		animal.getSound();
		
		animal = new Pato();
		animal.getSound();
		
//		animal = new Animal();
//		animal.getSound();

		System.out.println("*************");
		
		animal = getAnimal();
		System.out.println(animal);
		animal.getSound();

		

	}

	private static Animal getAnimal() {
		Animal[] animals = {new Gallina(),new Gato(),new Perro(),new Pato()};
		//0,1, 2 , 3 
		int num = new Random().nextInt(animals.length);
		return animals[num];
	}

}
