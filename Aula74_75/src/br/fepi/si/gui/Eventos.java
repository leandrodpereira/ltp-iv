package br.fepi.si.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	
	JButton bt;
	
	public Eventos(){
		super("Eventos");
		
		bt = new JButton("Clique");
		getContentPane().add(bt); 
		bt.addActionListener(this); //método que captura o evento e 
									//busca uma implementação para o mesmo
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Eventos();

	}

	@Override //Método que que realiza a ação 
	public void actionPerformed(ActionEvent e) {
		System.out.println("Estou ouvindo!");
		bt.setText("Fui clicado!");
		bt.setBackground(Color.BLUE);
	}

}
