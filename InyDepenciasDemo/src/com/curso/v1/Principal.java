package com.curso.v1;

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
		
		Inyector.inyectarPago(cliente1, "Transferencia");
		
		boolean aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
		Inyector.inyectarPago(cliente1, "PayPal");
		
		aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
		Cliente cliente2 = new Cliente("Andronico");
		
		Inyector.inyectarPago(cliente2, "PayPal");
		
		aplicoPago = cliente2.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
	}

}
