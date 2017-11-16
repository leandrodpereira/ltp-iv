package br.fepi.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilitariaCollection {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("Uva");
		frutas.add("Manga");
		frutas.add("Banana");
		frutas.add("Laranja");
		frutas.add("Goiaba");
		
		System.out.println(frutas.toString());
		
		
		//Ordenar
		Collections.sort(frutas);
		System.out.println(frutas.toString());
		//reverse
		Collections.reverse(frutas);
		System.out.println(frutas.toString());
		//altera a ordem aleatoriamente
		Collections.shuffle(frutas);
		System.out.println(frutas.toString());
		//Insere vários itens
		Collections.addAll(frutas, "Goiaba", "Pêra");
		System.out.println(frutas.toString());
		//Pesquisa e soma
		System.out.println(Collections.frequency(frutas, "Goiaba"));
		//Verifica se na lista tem uma sublista
		System.out.println(Collections.disjoint(frutas, Arrays.asList("Goiaba, Pêra")));
		//Busca binária
		System.out.println(Collections.binarySearch(frutas, "Pêra"));
		//Preenche toda a lista
		Collections.fill(frutas, "Maçã");
		System.out.println(frutas.toString());
		
		//Coleção que não pode ser modificada, cria uma visão apenas leitura
		Collection<Integer> x = new ArrayList<>();
		x = Collections.unmodifiableCollection(Arrays.asList(1,4,5));
		System.out.println(x.toString());
		try {
			x.add(1);			
			System.out.println(x.toString());
		}catch (Exception e) {
			System.err.println("Lista não pode ser modificada");
		}
		
	}

}
