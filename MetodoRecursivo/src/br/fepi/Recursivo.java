package br.fepi;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursivo {

	/**
	 * @param x
	 * @return soma até o limite de x
	 */
	public static int soma (int x){
		if (x == 1){			
			return x;
		}else{
			System.out.println(x);
			return x + soma(x-1);
		}
	}
	
	
	/**
	 * @param x
	 * @return fatorial de x
	 */
	public static int fatorial (int x){
		if (x == 1){
			System.out.print(x+" = ");
			return x;
		}else{
			System.out.print(x+" * ");
			return x * fatorial(x-1);
		}
	}
	
	
	
	/**
	 * @param x
	 * @param e
	 * @return potencia de um inteiro
	 */
	public static int potencia (int x, int e){
		if (e == 1){
			return x;
		}else {
			System.out.println(e);
			return x * potencia(x, e-1);
		}
	}
	
	/**
	 * Método que percorre recursivamente diretórios
	 * @param path
	 */
	public static void listar (Path path){
		if (Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			System.err.println(path.toAbsolutePath());
			try (DirectoryStream<Path> stream = 
					Files.newDirectoryStream(path)){
				for (Path p : stream) {
					listar(p);
				}
			} catch (Exception e) { }
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(soma(5));
		//System.out.println(potencia(3, 3));
		//listar(Paths.get("/home/lduarte/git"));
		System.out.print(fatorial(6));
	}

}
