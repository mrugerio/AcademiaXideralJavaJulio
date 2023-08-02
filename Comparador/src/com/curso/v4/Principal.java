package com.curso.v4;

import java.util.*;

import pojo.Empleado;

public class Principal {
	
	public static void main(String[] args) {
		
		Comparator<Empleado> compNombre = (o1, o2) ->  o1.getNombre().compareTo(o2.getNombre());
		Comparator<Empleado> compEdad = (o1, o2) -> o1.getEdad() - o2.getEdad();
		Comparator<Empleado> compSueldo = (o1, o2) -> (int)(o1.getSueldo() - o2.getSueldo());
		
		System.out.println("**v4**");
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,16.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Epeneto",17,50.03));
		
		System.out.println("Ordenar por Nombre");
		Collections.sort(listaEmpleados,compNombre);
		for (Empleado emp: listaEmpleados)
			System.out.println(emp);
		
		System.out.println("Ordenar por Edad");
		Collections.sort(listaEmpleados,compEdad);
		for (Empleado emp: listaEmpleados)
			System.out.println(emp);
		
		System.out.println("Ordenar por Sueldo");
		Collections.sort(listaEmpleados,compSueldo);
		for (Empleado emp: listaEmpleados)
			System.out.println(emp);
	}

}
