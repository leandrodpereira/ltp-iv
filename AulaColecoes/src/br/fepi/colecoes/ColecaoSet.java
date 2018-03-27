package br.fepi.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ColecaoSet {

	public static void main(String[] args) {
		
		/*String[] alunos = {"pedro", "maria","joana", 
		                   "augusto", "maria", "joana", };
		List<String> list = Arrays.asList(alunos);
		
		System.out.println(list);*/
		
		//Criando Cole��o Set (sem duplicidade)
		Set<Double> listSet = new HashSet<>();
		listSet.add(8.0);
		listSet.add(-9.7);
		listSet.add(1.8);
		
		System.out.println(listSet+""+listSet.size());
		
		//Estratégias de ordenação: Converter para Array
		Object[] order = listSet.toArray();	
		
		Arrays.sort(order);
		
		System.out.println(Arrays.toString(order));
		
		/*-----TreeSet: ordenação natural
		TreeSet<Double> listSet2 = new TreeSet<>();
		listSet2.add(1.0);
		listSet2.add(-5.0);
		listSet2.add(0.0); 
			
		System.out.println(listSet2+"TreeSet");
		
		*/
		
		
		TreeSet<String> listSet2 = new TreeSet<>();
		listSet2.add("Fo".toUpperCase());
		listSet2.add("gr".toUpperCase());
		listSet2.add("aa".toUpperCase()); 
		System.out.println(listSet2+"TreeSet");
		
		//Unicidade com objetos usando o m�todo equals 
		List<Produto> listaObjetos = new ArrayList<>();
		listaObjetos.add(new Produto(1, "vassora"));
		listaObjetos.add(new Produto(1, "vassora"));
		
		System.out.println(listaObjetos.toString());
		
		Set<Produto> listSetObj = new HashSet<>(listaObjetos);
		
		System.out.println(listSetObj.toString());
	}

}

class Produto {
	private int id;
	private String desc;	
		
	public Produto(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", desc=" + desc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}		
	
}
