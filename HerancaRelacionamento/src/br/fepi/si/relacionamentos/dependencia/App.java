package br.fepi.si.relacionamentos.dependencia;

public class App {
	
	public static void main(String[] args) {
		
		Pais br = new Pais();
		br.setNome("Brasil");
		br.setSigla("BR");
		
		Estado mg = new Estado(br);
		mg.setCapital("BH");
		mg.setNome("Minas Gerais");
		
		Estado sp = new Estado(br);
		sp.setCapital("SP");
		sp.setNome("São Paulo");		
		
		System.out.println(mg.toString());
		System.out.println(sp.toString());
	}
	
	
}
