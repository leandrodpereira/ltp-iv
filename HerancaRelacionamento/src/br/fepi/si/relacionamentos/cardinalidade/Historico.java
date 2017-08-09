package br.fepi.si.relacionamentos.cardinalidade;

public class Historico {
	
	private int conclusao;
	private int media;
	private Aluno aluno;
	
	public int getConclusao() {
		return conclusao;
	}
	public void setConclusao(int conclusao) {
		this.conclusao = conclusao;
	}
	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	@Override
	public String toString() {
		return "Historico [conclusao=" + conclusao + ", media=" + media + "]";
	}
	
	
	

}
