package br.fepi.si.chat;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe para o cliente
 * 
 * @author lduarte
 *
 */
public class ChatCliente extends JFrame {

	JTextField textoParaEnviar;
	Socket socket;
	PrintWriter escritor;
	String nome;
	JTextArea textoRecebido;
	Scanner leitor;

	private class EscutaServidor implements Runnable {

		@Override
		public void run() {
			try {
				String texto;
				while ((texto = leitor.nextLine()) != null) {
					textoRecebido.append(texto + "\n");
				}
			} catch (Exception e) {
			}
		}

	}

	public void configurarRede() {
		try {
			socket = new Socket("127.0.0.1", 5000);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
		} catch (Exception e) {
		}
	}

	public ChatCliente(String nome) {
		super("Chat: " + nome);
		this.nome = nome;
		textoParaEnviar = new JTextField();
		JButton botao = new JButton("Enviar");
		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());

		textoRecebido = new JTextArea();
		JScrollPane scroll = new JScrollPane(textoRecebido);

		envio.add(BorderLayout.CENTER, textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);
		getContentPane().add(BorderLayout.SOUTH, envio);
		getContentPane().add(BorderLayout.CENTER, scroll);

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				escritor.println(nome + " : " + textoParaEnviar.getText());
				escritor.flush();
				textoParaEnviar.setText("");
				textoParaEnviar.requestFocus();
			}
		});

		configurarRede();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChatCliente("Leandro");
		new ChatCliente("Regiane");
	}

}
