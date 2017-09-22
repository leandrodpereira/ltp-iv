package br.fepi.si.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Montando uma simples janela
 * @author Leandro
 * Lab 1
 */
public class Exemplo1 extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Exemplo1(){
		
		super("Janela Exemplo"); //Construtor de JFrame		
		
		JButton botao = new JButton("Clique aqui!");		
		
		getContentPane().add(botao); //Inserindo componentes
			
		setSize(300, 300);//Largura e Altura
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
				
	}

	public static void main(String[] args) {
	
		new Exemplo1(); //Nova instância de Janela
		
	}

	
	
}
