package Parte1;

public class Hilo extends Thread {

	private static int identificadores = 0;
	private int identificador = ++identificadores;

	@Override
	public void run() {
		int segundos = (int) (Math.random() * 5 + 1);
		System.out.println("Soy el hilo " + identificador + " y me pongo a dormir " + segundos + " segundos");
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Soy el hilo " + identificador + " y he terminado de dormir");
	}
}