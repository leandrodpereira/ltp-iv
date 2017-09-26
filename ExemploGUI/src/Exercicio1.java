import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercicio1 extends JFrame implements ActionListener {	
	
		
		private static final long serialVersionUID = 1L;
		JButton bt;
		int i = 0;
		
		public Exercicio1(){
			super("Eventos");
			
			bt = new JButton("Altera cor");
			
			getContentPane().add(BorderLayout.SOUTH, bt); 
			bt.addActionListener(this); //método que captura o evento e 
										//busca uma implementação para o mesmo
			
			setSize(300, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(false);
		}

		public static void main(String[] args) {
			
			new Exercicio1();

		}

		@Override //Método que que realiza a ação 
		public void actionPerformed(ActionEvent e) {			
			
			if (i==0){
				this.getContentPane().setBackground(Color.BLUE);
				bt.setText("Azul");
				i++;
			}else {
				this.getContentPane().setBackground(Color.RED);
				bt.setText("Vermelho");
				i--;
			}
		}

	}



