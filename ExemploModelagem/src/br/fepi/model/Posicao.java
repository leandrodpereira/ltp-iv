package br.fepi.model;

public class Posicao {
	
	private int numero;
	private Ciclista competidor;
	private Evento prova;	
	
	public Posicao(int numero, Ciclista competidor, Evento prova) {
		setNumero(numero);
		setCompetidor(competidor);
		setProva(prova);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Ciclista getCompetidor() {
		return competidor;
	}
	public void setCompetidor(Ciclista competidor) {
		this.competidor = competidor;
	}
	public Evento getProva() {
		return prova;
	}
	public void setProva(Evento prova) {
		this.prova = prova;
	}	
}
