package br.fepi.si.interfaces;

public abstract class Veiculo implements ValidaIdentificacao, VerificaRoubo {

	private String placa;
	private String chassi;
	private String marcaModelo;
	
	public static final int caracteres = 7;
	
	/**
	 * @param placa
	 * @param chassi
	 * @param marcaModelo
	 */
	public Veiculo(String placa, String chassi, String marcaModelo) {
		this.placa = placa;
		this.chassi = chassi;
		this.marcaModelo = marcaModelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getMarcaModelo() {
		return marcaModelo;
	}
	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", chassi=" + chassi + ", marcaModelo=" + marcaModelo + "]";
	}
	
	

}
