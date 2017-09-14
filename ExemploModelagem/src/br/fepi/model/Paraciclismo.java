package br.fepi.model;

import java.util.List;

public class Paraciclismo extends Evento {
	
	
	public Paraciclismo(int id, String nome, String data, String local, double kilometragem, double tempoProva,
			List<Posicao> posicoes) {
		super(id, nome, data, local, kilometragem, tempoProva, posicoes);
		
	}

	@Override
	public double calculaPremio() {
		// TODO Auto-generated method stub
		return 3_500.00;
	}

	

	

}
