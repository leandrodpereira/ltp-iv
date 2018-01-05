package br.fepi.multithreads;

import java.util.Random;

/**
 * Classe produtora de informação compartilhada
 * @author lduarte
 *
 */
public class Produtor implements Runnable {
	
	private Ponte ponte;	
	
	public Produtor(Ponte ponte) {
		this.ponte = ponte;
	}

	@Override
	public void run() {
		int total = 0; //Controle
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(new Random().nextInt(3000));
				total += i;
				ponte.set(i);
				System.out.println("\t"+total);
			} catch (InterruptedException e) {
				
			}
		}

	}

}
