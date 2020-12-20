package Parte2;

public class Main {

	public static void main(String[] args) {
		// CREAMOS UNA CARTERA QUE MODIFICARAN TANTO LOS CLIENTES COMO LOS WORKERS
		Cartera cartera = new Cartera(0);

		// CREAMOS UN ARRAY DE 10 CLIENTES
		Client listaDeClientes[] = new Client[10];

		// EJECUTAMOS LOS CLIENTES PASANDOLES ANTES LA CARTERA COMO PARAMETRO
		for (Client clientes : listaDeClientes) {
			clientes = new Client(cartera);
			clientes.start();
		}

		// CREAMOS UN ARRAY DE 10 WORKERS
		Worker listaDeWorkers[] = new Worker[10];

		// EJECUTAMOS LOS WORKERS PASANDOLES LA CARTERA COMO PARAMETRO
		for (Worker worker : listaDeWorkers) {
			worker = new Worker(cartera);
			worker.start();
		}
	}
}