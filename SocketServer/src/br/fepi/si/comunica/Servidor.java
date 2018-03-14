package br.fepi.si.comunica;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(5000);
		
		while(true) {
			Socket socket = server.accept();
			try(PrintWriter p = new PrintWriter(socket.getOutputStream())){
				p.write("Olá Cliente"+socket.getRemoteSocketAddress());
			};
			
		}
		
	}
	

	

}
