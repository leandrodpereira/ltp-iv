package br.fepi.sistemas.lab14;
/*	
 * Enum com construtor.
 */
public enum EstadosSudeste {

MG("Minas Gerais"), SP("São Paulo"), ES("Espírito Santo"), RJ("Rio de Janeiro");
	
	public String nome;
	
	private EstadosSudeste(String nome) {
		this.nome = nome;
	}
	
	
}
