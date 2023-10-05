package com.curso.lunes2;

public class Blip {
	protected int blipvert(int x) {
		return 0;
	}
}

class Vert extends Blip {
	
	//OVERRIDING (SOBREESCRITURA)
	//protected  long blipvert(int x){return 0;} //FALLA
	//OVERRIDING (SOBREESCRITURA)
	//protected  int blipvert(int x){return 0;} //FUNCIONA
	//OVERLOADING (SOBRECARGA)
	//private  char blipvert(long x){return 0;} //FUNCIONA pero no es un Override
	//OVERLOADING (SOBRECARGA)
	//private long blipvert(int x, int y) { return 0; } //FUNCIONA
	//OVERRIDING (SOBREESCRITURA)
	//public int blipvert(int x) { return 0; }
	//OVERLOADING (SOBRECARGA)
	//private int blipvert(long x){ return 0;}
	//OVERRIDING (SOBREESCRITURA)
	//protected long blipvert(int x){ return 0;} //FALLA
	//OVERLOADING (SOBRECARGA)
	private long blipvert(){ return 0;} //FALLA
	
	
	
}