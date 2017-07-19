package br.fepi.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import br.fepi.model.Conta;
import br.fepi.serializador.SerializaObjetos;

public class AppGrava extends SerializaObjetos{
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String path = "/home/leandro/workspace-ltp4/Aula68/contas.ser";
		
		Collection<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Leandro", 10_000));
		contas.add(new Conta("Maria", 10_500));
		contas.add(new Conta("Joseph", 2_000));
		
		gravaObjetos(contas, path);
	}
	
	

}
