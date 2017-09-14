package br.fepi.model;

import java.util.List;

public class Pista extends Evento {	
	

	public Pista(int id, String nome, String data, String local, double kilometragem, double tempoProva,
			List<Posicao> posicoes) {
		super(id, nome, data, local, kilometragem, tempoProva, posicoes);		
	}
	

	@Override
	public double calculaPremio() {
		return 1_500.00;
	}
	

	
	
}
