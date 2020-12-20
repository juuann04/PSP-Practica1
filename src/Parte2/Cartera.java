package Parte2;

public class Cartera {

	// VARIABLES
	private int dinero;

	// CONSTRUCTOR
	public Cartera(int dinero) {
		this.dinero = dinero;
	}

	// METODOS Y/O FUNCIONES
	public synchronized void incrementarDinero(int cantidadAIncrementar) {
		// IMPRIMIMOS EL DINERO QUE HAY ACTUALMENTE EN LA CARTERA Y CUANTO DINERO LE
		// VAMOS A SUMAR
		System.out.println("Dinero actual\t" + dinero + "\nDinero añadido:\t" + cantidadAIncrementar);

		// SUMAMOS EL DINERO
		dinero += cantidadAIncrementar;

		// IMPRIMIMOS EL DINERO YA SUMADO
		System.out.println("Dinero total:\t" + dinero + "\n");
	}

	public synchronized void decrementarDinero(int cantidadADecrementar) {
		// IMPRIMIMOS EL DINERO QUE HAY ACTUALMENTE EN LA CARTERA Y CUANTO DINERO LE
		// VAMOS A RESTAR
		System.out.println("Dinero actual\t" + dinero + "\nDinero gastado:\t" + cantidadADecrementar);

		// RESTAMOS EL DINERO
		dinero -= cantidadADecrementar;

		// IMPRIMIMOS EL DINERO YA RESTADO
		System.out.println("Dinero total:\t" + dinero + "\n");
	}
}