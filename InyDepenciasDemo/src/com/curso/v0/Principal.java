package com.curso.v0;

enum MetodoPago {
	PAYPAL, CHEQUE, TRANSFERENCIA, BITCOIN
}

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Patrobas");
		
		Inyector.inyectarPago(cliente1, MetodoPago.CHEQUE);
		
		boolean aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
		Inyector.inyectarPago(cliente1, MetodoPago.TRANSFERENCIA);
		
		aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		

		
	}

}
