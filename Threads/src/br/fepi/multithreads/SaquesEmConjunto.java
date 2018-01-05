package br.fepi.multithreads;

public class SaquesEmConjunto implements Runnable {
	
	ContaConjunta conta = new ContaConjunta();
			//Todos sacadores compartilham a conta conjuta, unica conta pra
					//ser compartilhada

	public static void main(String[] args) {
		
		SaquesEmConjunto fazerSaques = new SaquesEmConjunto(); //objeto Runnable
		
		//abrindo Threads
		new Thread(fazerSaques,"Pai").start();
		new Thread(fazerSaques,"Mãe").start();
		new Thread(fazerSaques,"Filha").start();
		new Thread(fazerSaques,"Sobrinha").start();
	}
	
	
	@Override
	public void run() {
		String cliente = Thread.currentThread().getName().toUpperCase();
		for(int i=0; i<2; i++){
			conta.sacar(20, cliente);
			if(conta.getSaldo() < 0){
				System.out.println("Conta estourada!");
			}
		}
		
	}

}
