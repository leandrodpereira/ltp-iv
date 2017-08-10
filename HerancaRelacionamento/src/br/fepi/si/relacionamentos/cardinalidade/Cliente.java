package br.fepi.si.relacionamentos.cardinalidade;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private String endereco;
	private List<Game> games = new ArrayList<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + "\ngames=" + games + "]";
	}

	
	
}
