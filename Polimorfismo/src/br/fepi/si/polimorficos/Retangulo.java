package br.fepi.si.polimorficos;

public class Retangulo extends DuasDimensoes {
	
	public double base;
	public double altura;

	public Retangulo(String cor, int espessuraDaBorda, 
			double base, double altura) {
		super(cor, espessuraDaBorda);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void calculoDeArea() {
		System.out.println(base * altura);
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + 
				" " + super.toString() + "]";
	}
	
	
	
}
