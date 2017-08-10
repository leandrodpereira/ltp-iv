package br.fepi.sistemas.lab15;

public class Bebida {
	
	private double volumeAlcool;
	private String fabricante;
	private Formula form; //Relação um pra uma com Formula
	
	//Construtor que passa parametros
	public Bebida(double volumeAlcool,String fabricante, Formula form){
		this.setVolumeAlcool(volumeAlcool);
		this.setFabricante(fabricante);
		this.setForm(form);
	}
	//Construtor Vazio
	public Bebida(){
		
	}	
	
	public double getVolumeAlcool() {
		return volumeAlcool;
	}

	public void setVolumeAlcool(double volumeAlcool) {
		this.volumeAlcool = volumeAlcool;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Formula getForm() {
		return form;
	}

	public void setForm(Formula form) {
		this.form = form;
	}
	@Override
	public String toString() {
		return "Bebida [volumeAlcool=" + volumeAlcool + ", fabricante=" + fabricante + ", form=" + form + "]";
	}

	

}
