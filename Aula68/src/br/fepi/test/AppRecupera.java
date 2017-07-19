package br.fepi.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import br.fepi.model.Conta;
import br.fepi.serializador.SerializaObjetos;

public class AppRecupera extends SerializaObjetos {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		
		String path = "/home/leandro/workspace-ltp4/Aula68/contas.ser";
		
		Collection<Conta> contas = retornaObjetos(path);
		
		contas.forEach(System.out::println); //Reescrever toString() do tipo 
	}

}
