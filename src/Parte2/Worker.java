package Parte2;

public class Worker extends Thread {

	private Cartera cartera;
	
	public Worker(Cartera cartera) {
        this.cartera = cartera;
    }

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cartera.decrementarDinero((int) (Math.random() * 100));
		}
	}
}