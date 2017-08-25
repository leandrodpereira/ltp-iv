package br.fepi.relacionamentos.composicao;

public class Motor {
	
	private int serie;
	private double potencia;
	private int qtdCilindro;
	
	
	
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public int getQtdCilindro() {
		return qtdCilindro;
	}
	public void setQtdCilindro(int qtdCilindro) {
		this.qtdCilindro = qtdCilindro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + serie;
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
		Motor other = (Motor) obj;
		if (serie != other.serie)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Motor [serie=" + serie + ", potencia=" + potencia + ", qtdCilindro=" + qtdCilindro + "]";
	}	
	
}
