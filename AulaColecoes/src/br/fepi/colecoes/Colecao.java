package br.fepi.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
	
	public static void main(String[] args) {
		//operações básicas: inserir, remover, toString, isEmpty, contains
		Collection<String> c = new ArrayList<>();
		c.add("A");
		//grupos
		Collection<String> c2 = Arrays.asList("B","C"); //Conver Array para Coleção
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2));//Verifica se tem todos elementos de c2
		//Percorrer com for each, pesquisar forma cantrata Java 8
		//Converter coleção para Array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		c.clear();//limpa coleção
		System.out.println(c.toString());
	}

}
