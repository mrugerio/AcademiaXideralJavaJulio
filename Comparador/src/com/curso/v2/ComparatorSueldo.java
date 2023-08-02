package com.curso.v2;

import java.util.Comparator;

import pojo.Empleado;

public class ComparatorSueldo implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return (int)(o1.getSueldo() - o2.getSueldo());
	}

}
