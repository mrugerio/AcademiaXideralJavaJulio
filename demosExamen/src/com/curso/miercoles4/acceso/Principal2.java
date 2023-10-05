package com.curso.miercoles4.acceso;

import com.curso.miercoles4.Pato2;

public class Principal2 extends Pato2{
	
	public int edad = 8;

	Principal2(){
		System.out.println("Constructor Principal2");
	}
	
	public static void main(String[] args) {
		Pato2 p = new Principal2();
		p.nombre = "Donald";
		
		System.out.println(p.edad);
		System.out.println(p.nombre);
		
		p.volar();
		
	}

}
