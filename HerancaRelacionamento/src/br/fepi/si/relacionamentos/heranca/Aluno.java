package br.fepi.si.relacionamentos.heranca;

public class Aluno {
	
	private String nome;
	private String matricula;
	
	public Aluno(String nome, String matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	
}
