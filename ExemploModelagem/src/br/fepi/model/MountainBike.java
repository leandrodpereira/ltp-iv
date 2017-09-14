package br.fepi.model;

import java.util.List;

public class MountainBike extends Evento {	private int qtObstaculos;
	
	public MountainBike(int id, String nome, String data, String local, double kilometragem, double tempoProva,
			List<Posicao> posicoes) {
		super(id, nome, data, local, kilometragem, tempoProva, posicoes);
		setQtObstaculos(qtObstaculos);
	}

	
	public int getQtObstaculos() {
		return qtObstaculos;
	}

	public void setQtObstaculos(int qtObstaculos) {
		this.qtObstaculos = qtObstaculos;
	}

	@Override
	public double calculaPremio() {
		return (getKilometragem() * 8.00) + 100 * this.qtObstaculos;
	}


	@Override
	public String toString() {
		return super.toString()+"\nMountainBike [qtObstaculos=" + qtObstaculos + "]";
	}
	
	

}
