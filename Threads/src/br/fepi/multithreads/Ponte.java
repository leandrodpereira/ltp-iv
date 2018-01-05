package br.fepi.multithreads;

public interface Ponte {
	
	/**
	 * Método para definir a informação compatilhada
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;
	
	/**
	 * Método para recuperar a informação compatilhada
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
}
