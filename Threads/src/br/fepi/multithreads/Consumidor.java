package br.fepi.multithreads;

import java.util.Random;

/**
 * Classe consumidora de informação compartilhada
 * @author lduarte
 *
 */
public class Consumidor implements Runnable{	
		
		private Ponte ponte;	
		
		public Consumidor(Ponte ponte) {
			this.ponte = ponte;
		}

		@Override
		public void run() {
			int total = 0; //Controle
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(new Random().nextInt(3000));
					total += ponte.get();;					
					System.err.println("\t"+total);
				} catch (InterruptedException e) {
					
				}
			}

		
		}

}
