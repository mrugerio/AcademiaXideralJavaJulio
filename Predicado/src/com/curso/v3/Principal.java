package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		PredicadoEmpleado peMayorEdad = emp -> emp.getEdad()>18;
		PredicadoEmpleado peEsRico = emp -> emp.getSueldo()>500;
		
		boolean res;

		Empleado e1 = new Empleado("Patrobas", 20, 467.89);
		Empleado e2 = new Empleado("Tercio", 17, 967.89);
		Empleado e3 = new Empleado("Andronico", 26, 567.89);
		Empleado e4 = new Empleado("Epeneto", 15, 67.89);

		Empleado[] arrayEmpleados = {e1,e2,e3,e4};
		
		for (Empleado emp : arrayEmpleados) {
			System.out.println(emp);
			System.out.println("Es mayor edad: " + peMayorEdad.probar(emp));
			System.out.println("Es rico: " + peEsRico.probar(emp));
		}


	}

}
