package br.fepi.si.polimorficos;

public class Cubo extends TresDimensoes {
	
	private double aresta;

	public Cubo(String cor, int espessuraDaBorda, double aresta) {
		super(cor, espessuraDaBorda);
		this.aresta = aresta;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public void calculoDeArea() {
		System.out.println(Math.pow(6 * aresta, 2));
	}

	@Override
	public String toString() {
		return "Cubo [aresta=" + aresta + " " + super.toString() + "]";
	}
	
	
	
}
