package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version 5");
		boolean res;

		Empleado e1 = new Empleado("Patrobas", 20, 467.89);
		Empleado e2 = new Empleado("Tercio", 17, 967.89);
		Empleado e3 = new Empleado("Andronico", 26, 567.89);
		Empleado e4 = new Empleado("Epeneto", 15, 67.89);

		Empleado[] arrayEmpleados = {e1,e2,e3,e4};
		
		System.out.println("Es mayor de edad?");
		mostrarEmpleados(arrayEmpleados, emp -> emp.getEdad()>18 );
		
		System.out.println("Es billetes?");
		mostrarEmpleados(arrayEmpleados, x -> x.getSueldo()>500 );
		
		System.out.println("Longitud de nombre mayor a 7?");
		mostrarEmpleados(arrayEmpleados, pato -> pato.getNombre().length() > 7 );


	}
	
	static void mostrarEmpleados(Empleado[] arreglo, PredicadoEmpleado pe ) {
		
		for (Empleado emp : arreglo) {
			System.out.println(emp);
			//EJECUCION DE LA LAMBDA
			System.out.println(pe.probar(emp));
		} 
		
	}
	
	
	
	
	
	

}
