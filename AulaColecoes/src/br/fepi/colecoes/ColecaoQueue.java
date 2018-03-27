package br.fepi.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue extends LinkedList {

	public static void main(String[] args) {
		
		Queue<String> lanches = new LinkedList<>();
		lanches.add("X-Bacon");
		lanches.add("X-Salada");
		lanches.add("X-Tudo");
		lanches.add("Misto-quente");
		lanches.offer("Teste");
		
		System.out.println(lanches);
		//Primeiro da fila
		System.out.println(lanches.peek());
		//Retira o primeiro da fila
		System.out.println(lanches.poll());
		System.out.println(lanches);		
		
		
		//M�todosadicionais para o tipo LinkedList
		LinkedList<String> lanches2 = (LinkedList) lanches;
		lanches2.addFirst("X-Galinha");
		System.out.println(lanches2);
		
		System.out.println(lanches2.peekLast());
		
		lanches2.pollLast();
		System.out.println(lanches2);
		
		System.out.println(lanches2.pop());//Semelhante ao poll
		System.out.println(lanches2);
		
		int i = 1;
		for(String s : lanches2){			
			System.out.println(i+++" - "+s);
		}
		
		
	}		
	

}
