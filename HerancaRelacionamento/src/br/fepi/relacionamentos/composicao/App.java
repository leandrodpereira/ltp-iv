package br.fepi.relacionamentos.composicao;

public class App {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.setModelo("Fusca");
		c.setPlaca("DDD-4545");
		c.getMotor().setSerie(1234567890);
		c.getMotor().setPotencia(90);
		c.getMotor().setQtdCilindro(4);
		
		System.out.println(c.toString());
	}

}
