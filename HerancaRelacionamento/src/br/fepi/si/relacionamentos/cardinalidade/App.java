package br.fepi.si.relacionamentos.cardinalidade;

public class App {

	public static void main(String[] args) {

		//1 para 1
		Aluno a = new Aluno();
		a.setNome("joao");
		a.setMatricula("123");
		Historico h = new Historico();
		h.setConclusao(2008);
		h.setMedia(99);
		//referencias
		h.setAluno(a);
		a.setHistorico(h);

		System.out.println(a.toString());
		
		//1 para N
				
		Funcionario f1 = new Funcionario();
		f1.setNome("Joaquim");
		f1.setRg("11111");
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Jose");
		f2.setRg("22222");
		
		Empresa e = new Empresa();
		e.setNome("Votorantim");
		e.setSigla("VT");
		
		e.getFuncionarios().add(f1);
		e.getFuncionarios().add(f2);
		
		for(Funcionario lista : e.getFuncionarios()){
			System.out.println(lista.getNome()+" trabalha na Empresa: "+e.getNome());
		}
		
		//N para N
		Game g1 = new Game();
		g1.setGenero("RPG");
		g1.setTitulo("The Wizard");
		Game g2 = new Game();
		g2.setGenero("Aventura");
		g2.setTitulo("‎Rogue Soul 2");
		
		Cliente c = new Cliente();
		c.setNome("Joãozinho");
		c.setEndereco("Av. Brasil");
		c.getGames().add(g1);
		c.getGames().add(g2);
		
		System.out.println(c.toString());
	
	}

}
