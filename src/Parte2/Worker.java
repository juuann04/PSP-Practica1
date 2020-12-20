package Parte2;

public class Worker extends Thread {

	// VARIABLES
	private Cartera cartera;

	// CONSTRUCTOR
	public Worker(Cartera cartera) {
		this.cartera = cartera;
	}

	// METODOS Y/O FUNCIONES
	public void run() {
		// EJECUTAMOS UN BUCLE INFINITO
		while (true) {
			try {
				// DORMIMOS EL HILO DURANTE 1 SEGUNDO
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// DECREMENTARA LA CARTERA ENTRE 0 Y 100
			cartera.decrementarDinero((int) (Math.random() * 100));
		}
	}
}