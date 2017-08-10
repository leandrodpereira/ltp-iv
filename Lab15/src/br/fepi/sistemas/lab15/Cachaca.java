package br.fepi.sistemas.lab15;

public class Cachaca extends Bebida {
	
	public String alambique;

	public String getAlambique() {
		return alambique;
	}

	public void setAlambique(String alambique) {
		this.alambique = alambique;
	}
	
	public Cachaca(double volumeAlcool,String fabricante, 
			Formula form, String alambique){
		super(volumeAlcool,fabricante,form);
		this.alambique = alambique;
	}
	
	@Override
	public String toString() {
		 return super.toString()+"\nAlambique="+alambique;
		 
	}
	
}
