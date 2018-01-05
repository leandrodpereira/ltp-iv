package br.fepi.multithreads;

public class PonteTeste {

	public static void main(String[] args) {
		
		//O consumidor deveria consumir apenas o que foi produzido
		
		//Ponte ponte = new PonteNaoSincronizada();
		Ponte ponte = new PonteSincronizada();
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
	}

}
