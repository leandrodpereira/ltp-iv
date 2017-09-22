package br.fepi.si.gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * Exemplo de uso de Layouts
 * @author Leandro
 *
 */
public class Exemplo2 extends JFrame {
	
		private static final long serialVersionUID = 1L;

	public Exemplo2(){
		super("Layouts");
		
		Container c = getContentPane(); //recuperando o container atrav�s de uma vari�vel
		
		/*c.setLayout(new BorderLayout());
		
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));  //Exemplo com BorderLayout
		 */		
		c.setLayout(new FlowLayout()); //M�todo que define o layout do container
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Exemplo2();
	}

}
