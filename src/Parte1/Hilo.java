package Parte1;

public class Hilo extends Thread {

	// ESTA VARIABLE LA NECESITAREMOS PARA IR SUMANDO 1 AL IDENTIFICADOR Y
	// DIFERENCIAR LOS HILOS UNOS DE OTROS.
	private static int identificadores = 0;

	// ESTA ES LA VARIABLE QUE USAREMOS PARA IDENTIFICAR Y LE IREMOS SUMANDO UNO
	// CADA VEZ QUE CREEMOS UN HILO
	private int identificador = ++identificadores;

	@Override
	public void run() {
		// CREAMOS UNA VARIABLE QUE SEA UN NUMERO ALEATORIO ENTRE 1 Y 5
		int segundos = (int) (Math.random() * 5 + 1);
		// IMPRIME EL HILO QUE SE Y CUANTO TIEMPO VA A DORMIR
		System.out.println("Soy el hilo " + identificador + " y me pongo a dormir " + segundos + " segundos");
		try {
			// DORMIMOS AL HILO ENTRE 1 Y 5 SEGUNDOS
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// IMPRIME EL HILO QUE ES Y QUE HA TERMINADO DE DORMIR
		System.out.println("Soy el hilo " + identificador + " y he terminado de dormir");
	}
}