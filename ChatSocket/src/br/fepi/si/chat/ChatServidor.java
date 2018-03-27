package br.fepi.si.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServidor {

	List<PrintWriter> escritores = new ArrayList<>();

	public ChatServidor() throws IOException {
		ServerSocket server = new ServerSocket(5000);
		Scanner sc;
		while (true) {
			Socket s = server.accept();
			new Thread(new EscutaCliente(s)).start();
			PrintWriter p = new PrintWriter(s.getOutputStream());
			escritores.add(p);
			/*
			 * sc = new Scanner(s.getInputStream()); System.out.println(sc.nextLine()); Para
			 * teste apenas
			 */

		}
	}

	private class EscutaCliente implements Runnable {

		Scanner leitor;

		public EscutaCliente(Socket socket) {
			try {
				leitor = new Scanner(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		private void encaminhaParaTodos(String texto) {
			for (PrintWriter printWriter : escritores) {
				try {
					printWriter.println(texto);
					printWriter.flush();
				} catch (Exception e) {
				}
			}
		}

		/**
		 * imprime as mgs no console
		 */
		@Override
		public void run() {
			String texto;
			while ((texto = leitor.nextLine()) != null) {
				// System.out.println(texto);
				encaminhaParaTodos(texto);
			}

		}

	}

	public static void main(String[] args) throws IOException {
		new ChatServidor();

	}

}
