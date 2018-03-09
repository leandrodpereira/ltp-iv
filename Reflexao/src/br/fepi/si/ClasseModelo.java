package br.fepi.si;

public class ClasseModelo {

	public String nome;
	public double peso;
	public boolean ativo;
	
	public ClasseModelo() {
		
	}

	public ClasseModelo(String nome, double peso, boolean ativo) {
		
		this.nome = nome;
		this.peso = peso;
		this.ativo = ativo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	@Override
	public String toString() {
		return "ClasseModelo [nome=" + nome + ", peso=" + peso + ", ativo=" + ativo + "]";
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
		ClasseModelo other = (ClasseModelo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}	
	
	
	
}
