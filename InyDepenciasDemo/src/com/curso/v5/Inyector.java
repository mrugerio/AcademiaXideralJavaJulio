package com.curso.v5;

public class Inyector {
	public static void inyectarPago(Cliente cliente1, MetodoPago metodoPago) {	
			cliente1.setMetodoPago(metodoPago);
	}
}
