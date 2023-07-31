package com.curso.v1;

public class Inyector {

	public static void inyectarPago(Cliente cliente1, String metodoPago) {
		
		//DESVENTAJA: DE LOS 4 OBJETOS CREADOS SOLO SE OCUPA 1
		
		MetodoPago metPag1 = new PayPal();
		MetodoPago metPag2 = new Cheque();
		MetodoPago metPag3 = new Transferencia();
		MetodoPago metPag4 = new BitCoin();


		switch(metodoPago){
			
			case "Cheque":
				cliente1.setMetodoPago(metPag2);
				break;
			case "Bitcoin":
				cliente1.setMetodoPago(metPag4);
				break;
			case "Transferencia":
				cliente1.setMetodoPago(metPag3);
				break;
			default:
				cliente1.setMetodoPago(metPag1);			
		}
	}

}
