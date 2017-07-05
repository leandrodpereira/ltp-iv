package br.fepi.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Diretorio {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Listar diretórios do SO.
		*/
		Iterable<Path> dire = FileSystems.getDefault().getRootDirectories();
		
		for(Path path : dire){
			System.out.println(path);
		}
		
		/**
		 * Listar arquivos de um diretório.
		*/
		Path dir = Paths.get("D:/");
		DirectoryStream<Path> listaArquivos = Files.newDirectoryStream(dir);
		
		for(Path path : listaArquivos){
			System.out.println(path);
		}
		
		/**
		 * Exibir detalhes de todos diretórios do SO.
		*/
		FileSystem fs = FileSystems.getDefault();
		
		for(FileStore store : fs.getFileStores()){
			System.out.println(store.toString());
			System.out.println(store.getTotalSpace()+" bytes");
			System.out.println();
		}
		
		/**
		 * Exibir detalhes de um diretório apenas.
		*/		
		FileStore s = Files.getFileStore(dir);
		System.out.println(s.toString());
		System.out.println(s.getTotalSpace()+" bytes");
	}

}
