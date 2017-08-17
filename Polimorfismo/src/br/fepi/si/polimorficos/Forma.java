package br.fepi.si.polimorficos;

public abstract class Forma {
	
	private String cor; 
	private int espessuraDaBorda;
	
	public Forma (String cor, int espessuraDaBorda) {
		this.cor = cor;
		this.espessuraDaBorda = espessuraDaBorda;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getEspessuraDaBorda() {
		return espessuraDaBorda;
	}
	public void setEspessuraDaBorda(int espessuraDaBorda) {
		this.espessuraDaBorda = espessuraDaBorda;
	}		
	
	@Override
	public String toString() {
		return "Forma [cor=" + cor + ", espessuraDaBorda=" + espessuraDaBorda + "]";
	}

	public abstract void calculoDeArea();

}
