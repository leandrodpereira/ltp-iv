package br.fepi.si.relacionamentos.heranca;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		Aluno ap = new AlunoPos("Leandro","2100");
		//ap.setAnoConclusaoGrad(2014); Não existe no Tipo Aluno
		System.out.println(ap.toString());
		
		//AlunoGrad app = (AlunoGrad) ap; Exemplo de erro de tipos
				
		Aluno a = ap; //refer�ncia para uma sub-classe
		
		System.out.println(a.getMatricula());
		
		AlunoPos apNovo = (AlunoPos) a; //type casting correto
		System.out.println(apNovo.toString());
		
		//Exemplo com List<>
		AlunoPos ap1 = new AlunoPos("JJ-Pos", "123");
		AlunoGrad ag1 = new AlunoGrad("JJ-Grad", "123");
		
		List<Aluno> listaDeAlunos = new ArrayList<>();
		listaDeAlunos.add(ap1);
		listaDeAlunos.add(ag1);
		
		for(Aluno recebeAluno : listaDeAlunos){
			System.out.println(recebeAluno.toString());
		}
		
		
		
	}

}
