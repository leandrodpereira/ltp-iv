package br.fepi.si.generico;

//Classe que pode receber qualquer tipo de dado
public class Generico<E> {
	
	private E qualquercoisa;	
	

	public E getQualquercoisa() {
		return qualquercoisa;
	}


	public void setQualquercoisa(E qualquercoisa) {
		this.qualquercoisa = qualquercoisa;
	}


	public static void main(String[] args) {
		
		Generico<Double> g = new Generico<>();
		g.setQualquercoisa(23.78);
		System.out.println(g.getQualquercoisa().intValue());
		
		Generico<String> g1 = new Generico<>();
		g1.setQualquercoisa("Texto");
		System.out.println(g1.getQualquercoisa().substring(2));
	}

}
