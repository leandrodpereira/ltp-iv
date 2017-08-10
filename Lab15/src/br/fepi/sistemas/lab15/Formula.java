package br.fepi.sistemas.lab15;

public class Formula {
	
	private int idFormula;
	
	public Formula(int idFormula){
		this.idFormula = idFormula;
	}

	public int getIdFormula() {
		return idFormula;
	}

	public void setIdFormula(int idFormula) {
		this.idFormula = idFormula;
	}

	@Override
	public String toString() {
		return "Formula [idFormula=" + idFormula + "]";
	}
	
	

}
