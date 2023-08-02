package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas", 20, 467.89);
		Empleado e2 = new Empleado("Tercio", 17, 967.89);
		Empleado e3 = new Empleado("Andronico", 26, 567.89);
		Empleado e4 = new Empleado("Epeneto", 15, 67.89);

		Empleado[] arrayEmpleados = {e1,e2,e3,e4};
		
		System.out.println(e1);

		PredicadoEmpleado peMayorEdad = emp -> emp.getEdad()>18;
		
		boolean resultado = peMayorEdad.probar(e1);
		System.out.println("Es Mayor Edad: "+resultado);
		
		PredicadoEmpleado peEsRico = emp -> emp.getSueldo()>500;
		
		resultado = peEsRico.probar(e1);
		System.out.println("Es Rico: "+resultado);
		
		System.out.println(e2);

		resultado = peMayorEdad.probar(e2);
		System.out.println("Es Mayor Edad: "+resultado);
		
		resultado = peEsRico.probar(e2);
		System.out.println("Es Rico: "+resultado);

		System.out.println(e4);

		resultado = peMayorEdad.probar(e4);
		System.out.println("Es Mayor Edad: "+resultado);
		
		resultado = peEsRico.probar(e4);
		System.out.println("Es Rico: "+resultado);


	}

}
