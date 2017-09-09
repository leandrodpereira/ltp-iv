package br.fepi.si.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author leandro
 *
 */
public class Calculadora extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6536467820732128092L;

	public Calculadora() {
		super("Calculadora");
		//Container dos números e operações
		Container botoes = new JPanel();
		botoes.setLayout(new GridLayout(4,4,5,5));
		botoes.add(new JButton("7"));
		botoes.add(new JButton("8"));
		botoes.add(new JButton("9"));
		botoes.add(new JButton("/"));
		
		botoes.add(new JButton("4"));
		botoes.add(new JButton("5"));
		botoes.add(new JButton("6"));
		botoes.add(new JButton("*"));
		
		botoes.add(new JButton("1"));
		botoes.add(new JButton("2"));
		botoes.add(new JButton("3"));
		botoes.add(new JButton("-"));
		
		botoes.add(new JButton("0"));
		botoes.add(new JButton("."));
		botoes.add(new JButton("="));
		botoes.add(new JButton("+"));
		
		JTextField display = new JTextField();
			
		display.setFont(new Font("serif",Font.PLAIN, 26));
		
		
		//Conatainer Principal
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, display);
		c.add(BorderLayout.CENTER, botoes);
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculadora();

	}

}
