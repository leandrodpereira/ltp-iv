package br.fepi.model;

import java.util.List;

public class Estrada extends Evento {
	
	private double kilometragem;
	private boolean acidentado; 

	public Estrada(int id, String nome, String data, 
			String local, List<Posicao> posicoes, double kilometragem, boolean acidentado) {
		super(id, nome, data, local, posicoes);
		setKilometragem(kilometragem);
		setAcidentado(acidentado);
	}

	public boolean isAcidentado() {
		return acidentado;
	}

	public void setAcidentado(boolean acidentado) {
		this.acidentado = acidentado;
	}

	public double getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}

	@Override
	public String toString() {
		return "Dados do Evento: [kilometragem=" + kilometragem + "km, acidentado=" 
				+ acidentado+ ",\nNome=" + getNome() + ", Data=" + getData()
				+ ", Local=" + getLocal() +" ]";
			
	}

	

	
	
}
