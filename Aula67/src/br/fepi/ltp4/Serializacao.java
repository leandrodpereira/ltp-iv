package br.fepi.ltp4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *@author leandro
 *@see Classe que grava e recupera objetos serializados
 */
public class Serializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/**
		 * Gravando
		 */
		String[] disciplinas = {"INF1","LTP3", "DS1","TE1"};

		FileOutputStream fos = 
				new FileOutputStream("/home/leandro/workspace-ltp4/Aula67/disciplinas.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		
		oos.writeObject(disciplinas);
		
		oos.close();
		
		/**
		 * Recuperando
		 */
		
		FileInputStream fis = 
				new FileInputStream("/home/leandro/workspace-ltp4/Aula67/disciplinas.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		String[] disciplinasRecuperadas = (String[]) ois.readObject();
		
		System.out.println(Arrays.toString(disciplinasRecuperadas));
	}

}
