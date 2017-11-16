package br.fepi.si.generico;

import java.util.ArrayList;
import java.util.List;

public class Coringas {
	
	/**
	 * Método de recebe como argumento qualquer filho da classe Number 
	 * "? extends Number", para especificar apenas a classe pai "? super Number" 
	 * @param lista
	 * @return
	 */
	public static double somatorio(List<? extends Number> lista){
		double r = 0;
		for(Number n : lista){
			r += n.doubleValue();
		}
		return r;		
	}

	public static void main(String[] args) {
		
		List<Integer> i = new ArrayList<>();
		i.add(5);
		i.add(90);
		i.add(6);
		
		System.out.println(somatorio(i));
	}

}
