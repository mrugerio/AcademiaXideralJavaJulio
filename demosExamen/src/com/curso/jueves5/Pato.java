package com.curso.jueves5;

public class Pato  {
	
	String nombre; //null
	int edad; //0
	
	Pato(){
		this("Donald"); //new Pato("Nombre Default");
		System.out.println("3: Constructor default");
	}

	public Pato(String nombre) {
		this(nombre,8);
		//this.nombre = nombre;
		System.out.println("2: Constructor con un string");
	}

	public Pato(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("1: Constructor con un string y un int");

	}

	public static void main(String[] args) {
		Pato p = new Pato();
		System.out.println(p);
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
