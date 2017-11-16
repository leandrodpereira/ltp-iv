package br.fepi.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		Map<Integer, String> alunos = new HashMap<>();
		alunos.put(1, "José Dirceu");
		alunos.put(2, "Chico Maia");
		alunos.put(3, "José Dirceu");
		alunos.put(4, "Maria Rita");
		
		System.out.println(alunos);
		
		//Métodos principais
		System.out.println(alunos.containsKey(1));
		System.out.println(alunos.containsValue("José Dirceu"));
		System.out.println(alunos.get(2));
		alunos.remove(3);
		System.out.println(alunos);
		
		Set<Integer> keys = alunos.keySet();//Recuperando as chaves
		for(int i : keys){
			System.out.println(i+":"+alunos.get(i));
		}
	}

}
