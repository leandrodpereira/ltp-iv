package br.fepi.si.relacionamentos.cardinalidade;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nome;
	private String sigla;
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	
}
