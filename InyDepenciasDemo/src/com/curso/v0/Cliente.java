package com.curso.v0;

public class Cliente {
	
	private String nombre; //HAS-A
	//BAJO ACOPLAMIENTO
	//ALTA COHESION
	private MetodoPago metodoPago; //HAS-A
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}

	public boolean aplicarPago() {
		System.out.println("El cliente: "+nombre+", "
				+"realizó pago con: "+metodoPago);
		return true;
		
	}



}
