package br.fepi.si.relacionamentos.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
	
	private String nome;
	private String endereco;
	private List<Departamento> departamentos = new ArrayList<Departamento>();
	
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
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	/**
	 * Método reescrito. Ao invés de recer uma lista, recebe um objeto, insere
	 * na lista de Departamentos e insere a referencia do próprio objeto instituto
	 * no atributo do objeto Departamento passado como parametro.
	 * @param d
	 */
	public void setDepartamentos(Departamento d) {
		this.departamentos.add(d);
		d.setInstituto(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instituto other = (Instituto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Instituto [nome=" + nome + "\nendereco=" + endereco + " Departamentos=" + departamentos + "]";
	}
	
	
	
	
}
