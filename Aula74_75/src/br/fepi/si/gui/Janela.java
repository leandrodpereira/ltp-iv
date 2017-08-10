package br.fepi.si.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Montando uma simples janela
 * @author Leandro
 *
 */
public class Janela extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Janela(){
		
		super("Janela Exemplo");
		
		JButton botao = new JButton("Clique aqui!");
		
		getContentPane().add(botao); //Inserindo componentes
		setSize(300, 300);//Largura e Altura
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
				
	}

	public static void main(String[] args) {
		
		new Janela();
	}

}
