package br.fepi.multithreads;

public class MortoVivoRunnable implements Runnable {

	String pavalvra;
	long tempo;

	public MortoVivoRunnable(String pavalvra, long tempo) {
		super();
		this.pavalvra = pavalvra;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		
			try {
				for(int i = 1;i < 100;i++){
					System.out.print(pavalvra+" ");
					Thread.sleep(tempo);
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
		Runnable morto = new MortoVivoRunnable("Morto", 1500);
		Runnable vivo = new MortoVivoRunnable("Vivo", 2000);
		
		new Thread(morto, "morto").start();;
		new Thread(vivo, "vivo").start();;
	}

}
