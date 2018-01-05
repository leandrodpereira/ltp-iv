package br.fepi.multithreads;

public class MortoVivo extends Thread {

	String pavalvra;
	long tempo;

	public MortoVivo(String pavalvra, long tempo) {
		super();
		this.pavalvra = pavalvra;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		
			try {
				for(int i = 1;i < 5;i++){
					System.out.print(pavalvra+" ");
					sleep(tempo);
				}
			} catch (InterruptedException e) {
				return;	//Informa que acabou a execução do método			
			}			
		
	}
	/**
	 * Cada objeto é instanciado em uma Thread diferente
	 * @param args
	 */
	public static void main(String[] args) {
		new MortoVivo("Morto", 1500).start();
		new MortoVivo("Vivo", 2000).start();
		
	}

}
