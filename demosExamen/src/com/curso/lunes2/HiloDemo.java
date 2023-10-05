package com.curso.lunes2;

class MyRunnable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Mensaje del Hilo 1");
	}
}

public class HiloDemo {

    public static void main(String[] args) {
    	
    	Runnable run1 =  new MyRunnable1();
    
        // Crear el primer hilo
        Thread hilo1 = new Thread(run1);

        // Crear el segundo hilo
        Thread hilo2 = new Thread(() -> System.out.println("Mensaje del Hilo 2"));

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        
        System.out.println("Los hilos han terminado su ejecución.");
    }
}
