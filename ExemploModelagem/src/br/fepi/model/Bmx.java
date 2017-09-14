package br.fepi.model;

import java.util.List;

public class Bmx extends Evento {

	

	public Bmx(int id, String nome, String data, String local, double kilometragem, double tempoProva,
			List<Posicao> posicoes) {
		super(id, nome, data, local, kilometragem, tempoProva, posicoes);
		
	}
	

	@Override
	public double calculaPremio() {
		return (getKilometragem() * getTempoProva() * 6.00);
	}
	
}
