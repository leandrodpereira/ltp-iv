package br.fepi.si.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Exemplo com 2 Layouts
 * @author Leandro
 *
 */
public class Exemplo3 extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Exemplo3(){
		super("Janela 2");
		
		Container c = getContentPane(); 
		
		Container c2 = new JPanel(); //Adicionando outro Layout
		
		c2.setLayout(new GridLayout(4, 1));//4 linhas e 1 coluna
		
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		
		c.add(BorderLayout.EAST, c2); //Inserindo o grid do lado direito 
		
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));		
		
		/*c.setLayout(new BorderLayout(5,5)); //Espaçamento
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.WEST, new JButton("W")); 
		
		c.setLayout(new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6")); */
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo3();

	}

}
