package br.fepi.model;

import java.util.List;

public class Estrada extends Evento {
	
	public Estrada(int id, String nome, String data, String local, 
			double kilometragem, double tempoProva, boolean acidentado,
				List<Posicao> posicoes) {
		super(id, nome, data, local, kilometragem, tempoProva, posicoes);
		setAcidentado(acidentado);
	}

	private boolean acidentado; 

	
	public boolean isAcidentado() {
		return acidentado;
	}

	public void setAcidentado(boolean acidentado) {
		this.acidentado = acidentado;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\nEstrada [acidentado=" + acidentado + "]";
	}

	@Override
	public double calculaPremio() {
		double valor = getKilometragem() * 5.00; 
		if (this.acidentado)
			valor += valor * 0.15;
		return valor;
	}

	
	
}
