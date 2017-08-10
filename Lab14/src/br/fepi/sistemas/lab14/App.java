package br.fepi.sistemas.lab14;

public class App {
	//Constantes
	static final String[] sexo = {"Masculino" , "Feminino" }; 

	
	
	public static void main(String[] args) {
		//Usando constantes
		System.out.println(App.sexo[0]);
		
		Semana s = Semana.Segunda;
		System.out.println(s);
		System.out.println(EstadosSudeste.MG.nome);
		
		Cadastro c = new Cadastro();
		c.setId(1);
		c.setEstado(EstadosSudeste.MG);
		c.setEstadoCivil(EstadoCivil.divorciado);
		c.setDiaTrabalho(Semana.Quarta);		
		
		System.out.println(c.toString());
	
//Mostrando todo o Enum
	
		for (EstadosSudeste es : EstadosSudeste.values()){//Método values monta um array com o Enum.
			System.out.println(es+" : "+es.nome);
		
		}
	}
}
