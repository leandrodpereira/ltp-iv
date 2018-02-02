package br.fepi.multithreads;

public interface Ponte {
	
	/**
	 * M�todo para definir a informa��o compatilhada
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;
	
	/**
	 * M�todo para recuperar a informa��o compatilhada
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
}
