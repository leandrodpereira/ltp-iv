package br.fepi.sistemas.lab11;

public class Matematica {
	private int m;
	private double s;
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return Maior valor
	 */
	public int maior(int n1, int n2){
		if (n1>n2)
			m=n1;
		else m=n2;
		return m;
		}
	
	public double soma(double v1, double v2){
		return (v1+v2);
	}
	
}
