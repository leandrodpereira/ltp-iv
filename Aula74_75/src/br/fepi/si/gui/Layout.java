package br.fepi.si.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
	
	public Layout(){
		super("Layouts");
		
		Container c = getContentPane(); //recuperando através de uma variável
		
		/*c.setLayout(new BorderLayout());
		
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2")); */
		
		c.setLayout(new FlowLayout()); //Método que define o layout do container
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Layout();
	}

}
