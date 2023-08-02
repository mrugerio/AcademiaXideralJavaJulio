package com.curso.v1;

public class EsRico implements PredicadoEmpleado {

	@Override
	public boolean probar(Empleado emp) {
		return emp.getSueldo()>500;
	}

}
