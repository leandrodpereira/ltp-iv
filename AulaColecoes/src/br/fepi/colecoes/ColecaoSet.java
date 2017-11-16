package br.fepi.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		/*String[] alunos = {"pedro", "maria","joana", 
		                   "augusto", "maria", "joana", };
		List<String> list = Arrays.asList(alunos);
		
		System.out.println(list);
		
		//Criando Coleção Set (sem duplicidade)
		Set<String> listSet = new HashSet<>(list);
		
		System.out.println(listSet);*/
		
		
		//Unicidade com objetos usando o método equals 
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
