package br.fepi.model;

public class Bicicleta {
	
	public Bicicleta (String modelo) {
		setModelo(modelo);
		
	}
	
	private String modelo;
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
