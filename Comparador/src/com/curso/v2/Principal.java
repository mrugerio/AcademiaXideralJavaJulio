package com.curso.v2;

import java.util.*;

import pojo.Empleado;

public class Principal {
	
	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,16.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Epeneto",17,50.03));
		
		System.out.println("Ordenar por Nombre");
		Collections.sort(listaEmpleados,new ComparatorNombre());
		for (Empleado emp: listaEmpleados)
			System.out.println(emp);
		
		System.out.println("Ordenar por Edad");
		Collections.sort(listaEmpleados,new ComparatorEdad());
		for (Empleado emp: listaEmpleados)
			System.out.println(emp);
		
		System.out.println("Ordenar por Sueldo");
		Collections.sort(listaEmpleados,new ComparatorSueldo());
		for (Empleado emp: listaEmpleados)
			System.out.println(emp);
	}

}
