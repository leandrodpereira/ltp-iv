package br.fepi.model;

import java.util.List;

public class Bmx extends Evento {
	
	private double kilometragem;

	public Bmx(int id, String nome, String data, String local, 
			List<Posicao> posicoes, double kilometragem) {
		super(id, nome, data, local, posicoes);
		setKilometragem(kilometragem);
	}

	public double getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}

}
