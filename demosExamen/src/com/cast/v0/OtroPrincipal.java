package com.cast.v0;

public class OtroPrincipal {

	public static void main(String[] args) {

		//DOWNCASTING (Cast hacia abajo, es obligatio hacer el CAST)
		Aguila a0 = new Aguila("Aguila",5);
		
		//métodos propios
		a0.volarAguila();
		a0.volar();
		
		//métodos por herencia
		a0.volarAve();
		System.out.println(a0.hashCode());
		
		System.out.println(a0.tipo);
		
		System.out.println("*****AVE******");
		
		//MUY BUENA PRACTICA
		Ave a1 = new Aguila("Aguila",5);
		
		//métodos propios
		((Aguila)a1).volarAguila();
		a1.volar();
		
		//métodos por herencia
		a1.volarAve();
		System.out.println(a1.hashCode());
		
		System.out.println("AVE: "+a1.tipo); //AVE
		System.out.println("AGUILA: "+ ((Aguila)a1).tipo); //AGUILA
		
		System.out.println("*****AGUILA REAL******");

		Ave a2 = new AguilaReal("Aguila Real",5);		
		
		//métodos propios
		//((AguilaReal)(Aguila)a2).volarAguilaReal();
		((AguilaReal)a2).volarAguilaReal();
		
		System.out.println("AVE: "+a2.tipo); //AVE
		System.out.println("AGUILA: "+((Aguila)a2).tipo); //AGUILA
		System.out.println("AGUILA REAL: "+((AguilaReal)(Aguila)a2).tipo); //AGUILA REAL

		System.out.println("*****AGUILA CALVA******");

		Ave a3 = new AguilaCalva("Aguila Calva",5);
		//AguilaReal a4 = (AguilaReal)a3;
		
		Object o = (Object)a3;
		System.out.println(o.hashCode());
		
	
	}

}
