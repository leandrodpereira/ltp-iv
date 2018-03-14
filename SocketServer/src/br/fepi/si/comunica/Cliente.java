package br.fepi.si.comunica;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws Exception, IOException {
		
		Socket socket = new Socket("127.0.0.1", 5000);
		try(Scanner s = new Scanner(socket.getInputStream())){
			System.out.println(s.nextLine());
		};
		
	}
	
}
