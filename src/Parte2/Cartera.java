package Parte2;

public class Cartera {
	private int dinero;
	
	public Cartera(int dinero) {
		this.dinero = dinero;
	}

	public synchronized void incrementarDinero(int cantidadAIncrementar) {
		System.out.println("Dinero actual\t" + dinero + "\nDinero añadido:\t" + cantidadAIncrementar);
		dinero += cantidadAIncrementar;
		System.out.println("Dinero total:\t" + dinero + "\n");
	}

	public synchronized void decrementarDinero(int cantidadADecrementar) {
		System.out.println("Dinero actual\t" + dinero + "\nDinero gastado:\t" + cantidadADecrementar);
		dinero -= cantidadADecrementar;
		System.out.println("Dinero total:\t" + dinero + "\n");
	}
}