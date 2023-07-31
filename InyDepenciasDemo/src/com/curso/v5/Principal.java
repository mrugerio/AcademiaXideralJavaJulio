package com.curso.v5;

interface MetodoPago {
	void ejecutaPago();
}

class PayPal implements MetodoPago{
	@Override
	public void ejecutaPago() {
		System.out.println("Se ejecuto pago con Paypal");
	}
}

class Cheque implements MetodoPago{
	@Override
	public void ejecutaPago() {
		System.out.println("Se ejecuto pago con Cheque");
	}
}

class Transferencia implements MetodoPago{
	@Override
	public void ejecutaPago() {
		System.out.println("Se ejecuto pago con Transferencia");
	}
}

class BitCoin implements MetodoPago{
	@Override
	public void ejecutaPago() {
		System.out.println("Se ejecuto pago con BitCoin");
	}
}

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Patrobas");
		
		System.out.println("MetodoPago: "+cliente1.getMetodoPago());

		Inyector.inyectarPago(cliente1, new BitCoin());
		
		System.out.println("MetodoPago: "+cliente1.getMetodoPago());

				

		
	}

}
