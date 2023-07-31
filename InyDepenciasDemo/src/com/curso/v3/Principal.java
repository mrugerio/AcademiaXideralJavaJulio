package com.curso.v3;

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
		
		Inyector.inyectarPago(cliente1, new BitCoin());
		
		boolean aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
		Inyector.inyectarPago(cliente1,new Cheque());
		
		aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
		Cliente cliente2 = new Cliente("Andronico");
		
		Inyector.inyectarPago(cliente2, new BitCoin());
		
		aplicoPago = cliente2.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
	}

}
