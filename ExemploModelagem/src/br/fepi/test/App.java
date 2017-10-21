package br.fepi.test;

import java.util.ArrayList;

import br.fepi.model.Bicicleta;
import br.fepi.model.Ciclista;
import br.fepi.model.Estrada;
import br.fepi.model.Posicao;

public class App {

	public static void main(String[] args) {
		
		Ciclista c1 = new Ciclista(1, "Zezinho", "BR", 'M',new Bicicleta("Caloi 10"));
		Ciclista c2 = new Ciclista(2, "Joaninha", "ARG", 'F',new Bicicleta("Ceci"));
		Ciclista c3 = new Ciclista(3, "Joãozinho", "POR", 'M', new Bicicleta("Monarq"));
		Ciclista c4 = new Ciclista(4, "Riquinho", "EUA", 'M', new Bicicleta("Caiçara"));		
		
		
		Estrada e = new Estrada(1, "Volta Ciclística", "17/01/2017", 
				"Guarulhos", 30, 1.00, true, new ArrayList<>());
		
				
		Posicao p1 = new Posicao(1, c4, e);
		Posicao p2 = new Posicao(2, c1, e);
		Posicao p3 = new Posicao(3, c2, e);
		
		e.getPosicoes().add(p1);
		e.getPosicoes().add(p2);
		e.getPosicoes().add(p3);
		
		System.out.println(e.toString());
		System.out.println("Classificação:");
		for (Posicao p : e.getPosicoes()) {
			System.out.println(p.getNumero()+" "+p.getCompetidor().getNome());
			}	
		
		//Navegação por ponto (1:1)
		System.out.println(p1.getCompetidor().getNome()+" correu a "
				+p1.getProva().getNome()+" com a bicicleta "
				+p1.getCompetidor().getBicicleta().getModelo());
		
		
		
		//Método da interface
		System.out.println("Prêmio: $"+e.calculaPremio());
	}

}
