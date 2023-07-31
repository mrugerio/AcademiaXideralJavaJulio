package com.curso.v3;

public class Inyector {
	public static void inyectarPago(Cliente cliente1, MetodoPago metodoPago) {	
			cliente1.setMetodoPago(metodoPago);
	}
}
