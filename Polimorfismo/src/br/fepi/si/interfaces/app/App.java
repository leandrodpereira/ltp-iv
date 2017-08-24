package br.fepi.si.interfaces.app;

import br.fepi.si.interfaces.Aluno;
import br.fepi.si.interfaces.CarroPasseio;
import br.fepi.si.interfaces.Pessoa;
import br.fepi.si.interfaces.Veiculo;

public class App {
	
		
	static String[] listaRoubados = {"123", "12345", "00004", "123456"};	
	
			
	public static void main(String[] args) {
				
		Aluno aluno = new Aluno("11111111111", "Joãozinho", 123);		
		System.out.println(aluno.toString());		
		System.out.println(aluno.verificaId(Pessoa.caracteres)?"Id Válida" : "Id Inválida");
		
		System.out.println("\n###############################################\n");
		
		CarroPasseio fusca = new CarroPasseio("PP3434", "120000", "VW - Fusca");
		System.out.println(fusca.toString());
		System.out.println(fusca.verificaId(Veiculo.caracteres)?"Id Válida" : "Id Inválida");
		System.out.println(fusca.analise(listaRoubados));
	}

}
