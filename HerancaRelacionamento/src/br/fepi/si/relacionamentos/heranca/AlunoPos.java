package br.fepi.si.relacionamentos.heranca;

public class AlunoPos extends Aluno  {
	
	private int anoConclusaoGrad;
	private String orientador;
	
	public AlunoPos (String nome, String matricula){super(nome, matricula);}
	//super(nome, matricula) é a mesma operação: this.setNome(nome);this.setMatricula(matricula); da classe mãe


	public int getAnoConclusaoGrad() {
		return anoConclusaoGrad;
	}



	public void setAnoConclusaoGrad(int anoConclusaoGrad) {
		this.anoConclusaoGrad = anoConclusaoGrad;
	}



	public String getOrientador() {
		return orientador;
	}



	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	
	

	
}
