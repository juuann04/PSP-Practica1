package Parte1;

public class Main {

	public static void main(String[] args) {
		// CREAMOS UN ARRAY DE 100 HILOS
		Hilo listaDeHilos[] = new Hilo[100];

		// EJECUTAMOS TODOS LOS HILOS DE FORMA SECUENCIAL
		for (Hilo threads : listaDeHilos) {
			threads = new Hilo();
			threads.start();
		}
	}
}