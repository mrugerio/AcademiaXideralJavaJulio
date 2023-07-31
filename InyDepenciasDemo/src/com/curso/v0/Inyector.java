package com.curso.v0;

public class Inyector {

	public static void inyectarPago(Cliente cliente1, MetodoPago metodoPago) {

		switch(metodoPago){
			
			case PAYPAL:
				cliente1.setMetodoPago(metodoPago);
				break;
			case CHEQUE:
				cliente1.setMetodoPago(metodoPago);
				break;
			case TRANSFERENCIA:
				cliente1.setMetodoPago(metodoPago);
				break;
			default:
				cliente1.setMetodoPago(metodoPago);			
		}
	}

}
