package br.fepi.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CheckBox extends JFrame{	
	
	JTextField t;
	JCheckBox negrito; 
	JCheckBox italico;
	
	
	public CheckBox() {
		super("Simples editor de texto");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		negrito = new JCheckBox("Negrito");
		negrito.addItemListener(new CheckBoxListener());
		
		italico = new JCheckBox("Itálico");
		italico.addItemListener(new CheckBoxListener());
		
		t = new JTextField(14);
		t.setFont(new Font("serif", Font.PLAIN, 14));
		
		c.add(new JLabel("Digite o texto: "));
		c.add(t);
		c.add(negrito);
		c.add(italico);
		setVisible(true);
		setSize(400 , 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class CheckBoxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (negrito.isSelected() && italico.isSelected()){
				t.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 14));
			}else if (negrito.isSelected()){
				t.setFont(new Font("serif", Font.BOLD, 14));
			}else if (italico.isSelected()){
				t.setFont(new Font("serif", Font.ITALIC, 14));
			}else{
				t.setFont(new Font("serif", Font.PLAIN, 14));
			}
			
		}
		
	}

	public static void main(String[] args) {
		new CheckBox();
		
	}

}
