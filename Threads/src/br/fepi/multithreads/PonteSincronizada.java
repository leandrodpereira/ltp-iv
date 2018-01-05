package br.fepi.multithreads;

public class PonteSincronizada implements Ponte {

	private int valor = -1;
	private boolean ocupado = false;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		while (ocupado) {
			System.out.println("Ponte cheia, produtor aguardando");
			wait();
		}
		
		System.out.print("Produziu "+valor);
		this.valor = valor;
		ocupado = true;
		notifyAll(); //Notifica a todas as Threads a mudança de estado
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while (!ocupado) {
			System.out.println("Ponte vazia, consumidor aguardando");
			wait();
		}
		
		System.err.print("Consumiu "+valor);
		ocupado= false;
		notifyAll();
		return valor;
	}

}
