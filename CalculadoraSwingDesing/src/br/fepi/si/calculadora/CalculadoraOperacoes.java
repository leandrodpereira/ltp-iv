package br.fepi.si.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author leandro
 *
 */
public class CalculadoraOperacoes extends JFrame {
	
	private static final long serialVersionUID = 6536467820732128092L;
	
	Operacoes op;
	Container c;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, 
			dividir, somar, subtrair, multiplicar, ponto, igual;
	JTextField display;
	String temp = "";
	double x, y;
	
	class TrataErros {
		void alerta(){
			JOptionPane.showMessageDialog(c, "Operação inválida");
			display.setText("");
			temp = "";
		}
	}
	
	enum Operacoes {
		soma, subtrcao, multiplicacao, divisao
	}
	
	public CalculadoraOperacoes() {
		super("Calculadora");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8"); 
		b9 = new JButton("9");
		b0 = new JButton("0"); 
		dividir = new JButton("/");
		somar = new JButton("+");
		subtrair = new JButton("-");
		multiplicar = new JButton("*");
		ponto = new JButton("."); 
		igual = new JButton("=");
		
		
		//Container dos números e operações
		Container botoes = new JPanel();
		botoes.setLayout(new GridLayout(4,4,5,5));
		botoes.add(b7);
		botoes.add(b8);
		botoes.add(b9);
		botoes.add(dividir);
		
		botoes.add(b4);
		botoes.add(b5);
		botoes.add(b6);
		botoes.add(multiplicar);
		
		botoes.add(b1);
		botoes.add(b2);
		botoes.add(b3);
		botoes.add(subtrair);
		
		botoes.add(b0);
		botoes.add(ponto);
		botoes.add(igual);
		botoes.add(somar);
		
		//Ações dos botoes numericos
		b1.addActionListener(new ActionsNumberButtons(b1.getText()));
		b2.addActionListener(new ActionsNumberButtons(b2.getText()));
		b3.addActionListener(new ActionsNumberButtons(b3.getText()));
		b4.addActionListener(new ActionsNumberButtons(b4.getText()));
		b5.addActionListener(new ActionsNumberButtons(b5.getText()));
		b6.addActionListener(new ActionsNumberButtons(b6.getText()));
		b7.addActionListener(new ActionsNumberButtons(b7.getText()));
		b8.addActionListener(new ActionsNumberButtons(b8.getText()));
		b9.addActionListener(new ActionsNumberButtons(b9.getText()));
		b0.addActionListener(new ActionsNumberButtons(b0.getText()));
		ponto.addActionListener(new ActionsNumberButtons(ponto.getText()));
		
		//Ações das operações
		somar.addActionListener(new ActionsSum());
		subtrair.addActionListener(new ActionSub());
		multiplicar.addActionListener(new ActionMult());
		igual.addActionListener(new ActionResul());		
		dividir.addActionListener(new ActionDiv());
		display = new JTextField();
			
		display.setFont(new Font("serif",Font.PLAIN, 26));
		display.setEditable(false);;
		
		//Conatainer Principal
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, display);
		c.add(BorderLayout.CENTER, botoes);
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CalculadoraOperacoes();

	}

	class ActionsNumberButtons implements ActionListener{
		
		String number; 
		
		
		public ActionsNumberButtons(String number) {
			this.number = number;
		}

		@Override
		public void actionPerformed(ActionEvent e) {	
			try{
				temp += number;
				display.setText(temp);	
			}catch (Exception err) {
				new TrataErros().alerta();
			}
					
		}
		
	}
	
	class ActionsSum implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				x = Double.parseDouble(temp);
				display.setText("");
				temp = "";
				op = Operacoes.soma;
			}catch (Exception err) {
				new TrataErros().alerta();
			}
		}
		
	}
	
	class ActionSub implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				x = Double.parseDouble(temp);
				display.setText("");
				temp = "";
				op = Operacoes.subtrcao;
			}catch (Exception err) {
				new TrataErros().alerta();
			}
						
		}
		
	}
	
	class ActionMult implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				x = Double.parseDouble(temp);
				display.setText("");
				temp = "";
				op = Operacoes.multiplicacao;
			}catch (Exception err) {
				new TrataErros().alerta();
			}
						
		}
		
	}
	
	class ActionDiv implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try{
				x = Double.parseDouble(temp);
				display.setText("");
				temp = "";
				op = Operacoes.divisao;		
			}catch (Exception err) {
				new TrataErros().alerta();
			}
				
		}
		
	}
	
		
	
	class ActionResul implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				y =  Double.parseDouble(temp);
				temp = "";
				switch (op){
					case soma: {
						display.setText(String.valueOf(x+y));
						break;
					}
					case multiplicacao: {
						display.setText(String.valueOf(x*y));
						break;
					}
					case divisao: {						
							display.setText(String.valueOf(x/y));
							break;						
										
					}
					case subtrcao: {
						display.setText(String.valueOf(x-y));
						break;
					}
				}
			}catch (Exception err) {
				new TrataErros().alerta();
			}
			
		}
		
	}

}
