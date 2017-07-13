package br.fepi.model;

import java.util.List;

public class MountainBike extends Evento {
	
	private double tempoProva;
	private int qtObstaculos;
	
	public MountainBike(int id, String nome, String data, 
			String local, List<Posicao> posicoes, double tempoProva, int qtObstaculos) {
		super(id, nome, data, local, posicoes);
		setTempoProva(tempoProva);
		setQtObstaculos(qtObstaculos);
	}

	public double getTempoProva() {
		return tempoProva;
	}

	public void setTempoProva(double tempoProva) {
		this.tempoProva = tempoProva;
	}

	public int getQtObstaculos() {
		return qtObstaculos;
	}

	public void setQtObstaculos(int qtObstaculos) {
		this.qtObstaculos = qtObstaculos;
	}

}
