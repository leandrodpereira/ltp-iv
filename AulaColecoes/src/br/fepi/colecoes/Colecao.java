package br.fepi.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Colecao {
	
	public static void main(String[] args) {
		//opera��es b�sicas: inserir, remover, toString, isEmpty, contains
		Collection<String> c = new ArrayList<>();
		c.add("A");
		//grupos
		Collection<String> c2 = Arrays.asList("B","C"); //Conver Array para Cole��o
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2));//Verifica se tem todos elementos de c2
		//Percorrer com for each, pesquisar forma cantrata Java 8
		c.forEach(System.out::println);
		//Converter cole��o para Array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		c.clear();//limpa cole��o
		System.out.println(c.toString());
		
	}

}
