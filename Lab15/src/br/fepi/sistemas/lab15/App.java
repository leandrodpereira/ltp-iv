package br.fepi.sistemas.lab15;

public class App {

	public static void main(String[] args) {
		
		Bebida b = new Cerveja(20,"Kaiser", new Formula(123));
		System.out.println(b.toString());
		
		System.out.println(b instanceof Cachaca);
		
		Bebida c = new Cachaca(12,"51", new Formula(124),"Barril");
		System.out.println(c.toString());
		
		System.out.println(c instanceof Cachaca);
		
		Cerveja cc = (Cerveja) b;//Type Cast: possível erro
	}

}
