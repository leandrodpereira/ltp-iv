package br.fepi.si.relacionamentos.heranca;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		AlunoPos ap = new AlunoPos("Leandro","2100");
		ap.setAnoConclusaoGrad(2014);
		System.out.println(ap.getNome()+ap.getMatricula());
		
		AlunoPos app = (AlunoPos) new Aluno(null, null);//Exemplo de erro de tipos
				
		Aluno a = ap; //referência para uma sub-classe
		Aluno b = new Aluno("Teste", "Teste");//Se a super classe não armazena
		//uma referência para a sub-classe convertida, uma exceção é disparada em run time
		System.out.println(a.getMatricula());
		
		AlunoPos apNovo = (AlunoPos) a; //type casting
		System.out.println(apNovo.getAnoConclusaoGrad());
		
		//Exemplo com List<>
		AlunoPos ap1 = new AlunoPos("JJ-Pos", "123");
		AlunoGrad ag1 = new AlunoGrad("JJ-Grad", "123");
		List<Aluno> listaDeAlunos = new ArrayList<>();
		listaDeAlunos.add(ap1);
		listaDeAlunos.add(ag1);
		
		for(Aluno recebeAluno : listaDeAlunos){
			System.out.println(recebeAluno.getNome());
		}
	}

}
