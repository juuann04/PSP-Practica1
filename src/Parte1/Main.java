package Parte1;

public class Main {

	public static void main(String[] args) {
		Hilo listaDeHilos[] = new Hilo[100];

		for (Hilo threads : listaDeHilos) {
			threads = new Hilo();
			threads.start();
		}
	}
}