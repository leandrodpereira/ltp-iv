package br.fepi.si.tratarErros;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Divisao {
	
	
	public static void dividir(int x, int y){
			JOptionPane.showMessageDialog(null,x/y);
	}

	
	public static void main(String[] args) {		
	
		boolean teste = true;
	
		do {
			
			try{
				
				
				int x = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("Divisor:"));
				dividir(x, y);
				
				teste = false;			
				
				//cath Individual
				
				/*}catch (ArithmeticException e1) {
					JOptionPane.showMessageDialog(null,"Não é permitida divisão por 0");
				}catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null,"Digite apenas inteiros");
				}*/
			
				/**
				 * Multi Cacth Java 7
				 */
				}catch (ArithmeticException | NumberFormatException e1) {
					e1.printStackTrace();					
					JOptionPane.showMessageDialog(null,"Entrada Inválida\n"+e1.getMessage());
				
			   }			
				finally{
					DateFormat d = DateFormat.getDateTimeInstance();
					System.err.println("Executado em "+
							d.format(System.currentTimeMillis()));
				}
			
			} while (teste);		
					
		
	}
}
