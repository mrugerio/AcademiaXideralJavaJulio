package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas", 20, 467.89);
		Empleado e2 = new Empleado("Tercio", 17, 967.89);
		Empleado e3 = new Empleado("Andronico", 26, 567.89);
		Empleado e4 = new Empleado("Epeneto", 15, 67.89);

		Empleado[] arrayEmpleados = {e1,e2,e3,e4};
		
		PredicadoEmpleado pe = new EsMayorEdad();
		
		boolean resultado = pe.probar(e1);
		
		System.out.println(e1);
		System.out.println(resultado);
		
		resultado = pe.probar(e4);
		
		System.out.println(e4);
		System.out.println(resultado);

	}

}
