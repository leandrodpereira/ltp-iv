package br.fepi.model;

import java.util.List;

public class Paraciclismo extends Evento {
	
	private double tempoProva;

	public Paraciclismo(int id, String nome, String data, String local, 
			List<Posicao> posicoes, double tempoProva) {
		super(id, nome, data, local, posicoes);
		setTempoProva(tempoProva);
	}

	public double getTempoProva() {
		return tempoProva;
	}

	public void setTempoProva(double tempoProva) {
		this.tempoProva = tempoProva;
	}

}
