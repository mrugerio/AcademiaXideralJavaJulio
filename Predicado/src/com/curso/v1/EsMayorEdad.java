package com.curso.v1;

public class EsMayorEdad implements PredicadoEmpleado {

	@Override
	public boolean probar(Empleado emp) {
		return emp.getEdad()>=18;
	}

}
