package br.fepi.model;

import java.io.Serializable;

public class Conta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cliente;
	private double saldo;	

	/**
	 * @param cliente
	 * @param saldo
	 */
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void exibeSaldo(){
		System.out.println(cliente+", saldo: R$"+saldo);
	}
	public void saca(double valor){
		//Uma s�rie de verifica��es devem ser feitas, mas vamos simplificar.
		saldo-=valor;
	}
	public void deposita(double valor){
		//Uma s�rie de verifica��es devem ser feitas, mas vamos simplificar.
		saldo+=valor;
	}
	public void tranferePara(Conta contaDestino, double valor){
		//Uma s�rie de verifica��es devem ser feitas, mas vamos simplificar.
		this.saca(valor);
		contaDestino.deposita(valor);	
		
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", saldo=" + saldo + "]";
	}

	
	
	
	
}
