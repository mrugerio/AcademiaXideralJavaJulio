package com.curso02.v3;

import com.curso01.v3.Pato;

public class Principal2 extends Pato {
	
	public Principal2() {
		super("Sin nombre");
	}

	public static void main(String[] args) {
		
		Principal2 prin2 = new Principal2();
		prin2.setNombre("Lucas");
		Principal2.setContador(100);
		System.out.println(prin2.getNombre());
		System.out.println(Principal2.getContador());

	}

}
