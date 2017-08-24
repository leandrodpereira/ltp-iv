package br.fepi.si.interfaces;

public abstract class Pessoa implements ValidaIdentificacao {

	private String cpf;
	private String nome;	
	
	public static final int caracteres = 11;
		
	/**
	 * @param cpf
	 * @param nome
	 */
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	@Override
	public String toString() {
		return "cpf=" + cpf + ", nome=" + nome + "]";
	}
	

}
