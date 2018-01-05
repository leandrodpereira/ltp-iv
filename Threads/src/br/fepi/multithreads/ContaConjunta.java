package br.fepi.multithreads;

import java.text.NumberFormat;

/**
 * 
 * @author lduarte
 * Exemplo Sincronização de Threads 
 */
public class ContaConjunta {
	
	private double saldo = 100.0;
	
	
	NumberFormat f = NumberFormat.getCurrencyInstance();

	public double getSaldo() {
		return saldo;
	}

	public synchronized void sacar(double valor, String cliente) {
		if(saldo >= valor){		
			double saldoAnterior = saldo;
			try {
				System.out.println(cliente+" solicitou saque.");
				System.out.println(cliente+" aguardanddo processando...");
				Thread.sleep(2000);//simulando consultas
			} catch (InterruptedException e) {}			
			saldo -= valor;
			System.out.println("[Saldo atual: "+f.format(saldo)+"] Operação realizada"
					+ " com sucesso por "+cliente+" [Saldo anterior: "+saldoAnterior+"]");
		}else{
			System.out.println("Saldo esgotado para "+ cliente);
		}
	}
	
	
	
}
