package br.fepi.si.tratarErros;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com valor diferente de 0");
		
		
		int v = s.nextInt();
		assert(v > 0):"Número inválido";
		
		System.out.println("Valor: "+v);
		
		
		

	}

}
