package com.curso.v1;

import java.util.*;

public class Principal1 {
	
	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,16.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Epeneto",17,50.03));
		
		Collections.sort(listaEmpleados);
		
		for (Empleado emp: listaEmpleados)
			System.out.println(emp);
	}

}
