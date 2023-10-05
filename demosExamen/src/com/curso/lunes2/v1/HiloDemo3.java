package com.curso.lunes2.v1;

class MyRunnable4 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Mensaje del Hilo 4 : " + i);
			try {
				Thread.sleep(500); // Pausa el hilo por 500 milisegundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable5 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Mensaje del Hilo 5 : " + i);
			try {
				Thread.sleep(500); // Pausa el hilo por 500 milisegundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class HiloDemo3 {

	public static void main(String[] args) { // MI HILO main
		
		System.out.println("Los hilos han comenzado su ejecución.");

		// Crear el primer hilo
		Thread hilo4 = new Thread(new MyRunnable4());

		// Crear el segundo hilo
		Thread hilo5 = new Thread(new MyRunnable5());

		// Iniciar los hilos
		hilo4.start();
		hilo5.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Los hilos han terminado su ejecución.");
	}
}
