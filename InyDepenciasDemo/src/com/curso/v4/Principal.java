package com.curso.v4;

interface MetodoPago {
	void ejecutaPago();
}

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Patrobas");
		
		Inyector.inyectarPago(cliente1, new MetodoPago() {
			@Override
			public void ejecutaPago() {
				System.out.println("Pago con PayPal");
			}
		});
		
		boolean aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
		Inyector.inyectarPago(cliente1,new MetodoPago() {
			@Override
			public void ejecutaPago() {
				System.out.println("Pago con Cheque");
			}
		});
		
		aplicoPago = cliente1.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
		Cliente cliente2 = new Cliente("Andronico");
		
		Inyector.inyectarPago(cliente2, new MetodoPago() {
			@Override
			public void ejecutaPago() {
				System.out.println("Pago con Bitcoin");
			}
		});
		
		aplicoPago = cliente2.aplicarPago();
		
		if(aplicoPago)
			System.out.println("El pago se realizó con exito");
		else {
			System.out.println("El pago fue denegado");
			System.out.println("Vuelva a intentar con otro método de pago");
		}
		
	}

}
