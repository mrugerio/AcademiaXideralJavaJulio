package com.curso.miercoles4.acceso;

import com.curso.miercoles4.Pato;

public class Principal extends Pato{
	
	Principal(){
		super(); //Tiene acceso al constructor del Pato
		System.out.println("Constructor Principal");
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.nombre = "Donald";
		
		System.out.println(p.nombre);
		
		p.volar();
		
	}

}
