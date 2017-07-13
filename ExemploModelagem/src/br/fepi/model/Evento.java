package br.fepi.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
	
	private int id;
	private String nome;
	private String data;
	private String local;	
	private List<Posicao> posicoes = new ArrayList<>();
	
	public Evento(int id, String nome, String data, String local, List<Posicao> posicoes) {
		setId(id);
		setNome(nome);
		setData(data);
		setLocal(local);
		setPosicoes(posicoes);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public List<Posicao> getPosicoes() {
		return posicoes;
	}

	public void setPosicoes(List<Posicao> posicoes) {
		this.posicoes = posicoes;
	}


	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", "
				+ "data=" + data + ", local=" + local
				+ "]";
	}

			
}
