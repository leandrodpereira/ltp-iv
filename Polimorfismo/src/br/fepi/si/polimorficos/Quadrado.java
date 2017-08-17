package br.fepi.si.polimorficos;

public class Quadrado extends DuasDimensoes {
	
	private double lado;

	public Quadrado(String cor, int espessuraDaBorda, double lado) {
		super(cor, espessuraDaBorda);	
		this.lado = lado;
	}

	@Override
	public void calculoDeArea() {
		System.out.println(Math.pow(lado,2));
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + " " + super.toString() + "]";
	}
	
	
	
}
