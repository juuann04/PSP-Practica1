package Parte2;

public class Client extends Thread {

	// VARIABLES
	private Cartera cartera;

	// CONSTRUCTOR
	public Client(Cartera cartera) {
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
			// INCREMENTARA LA CARTERA ENTRE 0 Y 100
			cartera.incrementarDinero((int) (Math.random() * 100));
		}
	}
}