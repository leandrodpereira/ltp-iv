package br.fepi.si.relacionamentos.cardinalidade;

public class Game {
	
	private String titulo;
	private String genero;
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Game [titulo=" + titulo + ", genero=" + genero + "]";
	}
	
	
}
