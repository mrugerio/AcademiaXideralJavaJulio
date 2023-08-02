package com.curso.v0;

public class EsMayorEdad implements PredicadoEmpleado {

	@Override
	public boolean probar(Empleado emp) {
		return emp.getEdad()>=18;
	}

}
