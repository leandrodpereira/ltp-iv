package br.fepi.si.interfaces;

public class Aluno extends Pessoa {
	
	private int ra;

	public Aluno(String cpf, String nome, int ra) {
		super(cpf, nome);
		this.ra = ra;
	}
	
	
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	@Override
	public boolean verificaId(int numeroCaracteres) {
		if(getCpf().length() != 11 ) {
			return false;
		}else return true;
	}


	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", "+super.toString();
	}
	
	

}
