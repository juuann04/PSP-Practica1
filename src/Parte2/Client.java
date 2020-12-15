package Parte2;

public class Client extends Thread {

	private Cartera cartera;
	
	public Client(Cartera cartera) {
        this.cartera = cartera;
    }

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cartera.incrementarDinero((int) (Math.random() * 100));
		}
	}
}