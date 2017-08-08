package br.fepi.si.relacionamentos.agregacao;

public class App {
	
	public static void main(String[] args) {
		
		Instituto i = new Instituto();
		i.setNome("Institutos de Exatas");
		i.setEndereco("Varginha");
		
		Departamento d1 = new Departamento();
		Departamento d2 = new Departamento();
		Departamento d3 = new Departamento();
		
		d1.setNome("Engenharias");
		d1.setSigla("DEN");
		
		d2.setNome("Tecnologia da Informação");
		d2.setSigla("DTI");
		
		d3.setNome("Ciências Básicas");
		d3.setSigla("DCB");
		
		i.setDepartamentos(d1);
		i.setDepartamentos(d2);
		i.setDepartamentos(d3);
		
	
		System.out.println(i.toString());
		System.out.println("--------------");
		System.out.println(d1.getInstituto().getNome());
	}
		
		
	
	
	
}
