package com.curso.lunes2.v1;

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Mensaje del Hilo 2");
	}
}

class MyRunnable3 implements Runnable {
	@Override
	public void run() {
		System.out.println("Mensaje del Hilo 3");
	}
}

public class HiloDemo2 {

    public static void main(String[] args) { //MI HILO main
    	
        System.out.println("Los hilos han comenzado su ejecución.");

    	Runnable run2 =  new MyRunnable2();
        // Crear el primer hilo
        Thread hilo2 = new Thread(run2);

        Runnable run3 =  new MyRunnable3();
        // Crear el segundo hilo
        Thread hilo3 = new Thread(run3);

        //NO SON HILOS DE EJECUCION
        run2.run();
        run3.run();
        
        System.out.println("Los hilos han terminado su ejecución.");
    }
}
