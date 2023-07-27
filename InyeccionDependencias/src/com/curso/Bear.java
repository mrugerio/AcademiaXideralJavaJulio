package com.curso;

public class Bear {
	
	private Bear pandaBear; //has-a

	private void roar(Bear b) {
		System.out.println("Roar!");
		pandaBear = b;
	}

	public static void main(String[] args) {
		Bear brownBear = new Bear();
		Bear polarBear = new Bear();
		brownBear.roar(polarBear);
		polarBear = null;
	}
}