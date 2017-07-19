package br.fepi.serializador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

import br.fepi.model.Conta;

/**
 * 
 * @author leandro
 *
 */
public abstract class SerializaObjetos {
	/**
	 * 
	 * @param colecao
	 * @param path
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void gravaObjetos(Collection<Conta> colecao, String path) 
			throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream(path)){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(colecao);
			}
		}
	}
	/**
	 * 
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Collection<Conta> retornaObjetos(String path) 
			throws FileNotFoundException, IOException, ClassNotFoundException{
		try(FileInputStream fis = new FileInputStream(path)){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				return (Collection<Conta>) ois.readObject();
			}
		}		
	}
}
