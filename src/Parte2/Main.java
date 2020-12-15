package Parte2;

public class Main {

	public static void main(String[] args) {
		Cartera cartera = new Cartera(0);

		Client listaDeClientes[] = new Client[10];
		for (Client clientes : listaDeClientes) {
			clientes = new Client(cartera);
			clientes.start();
		}

		Worker listaDeWorkers[] = new Worker[10];
		for (Worker worker : listaDeWorkers) {
			worker = new Worker(cartera);
			worker.start();
		}
	}
}