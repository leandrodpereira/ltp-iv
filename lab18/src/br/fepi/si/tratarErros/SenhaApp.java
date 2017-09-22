package br.fepi.si.tratarErros;

import java.util.Scanner;

public class SenhaApp {
	/**
	 * Método que lança exceções própria. Ao chamá-lo será obrigatório lançar 
	 * ou colocá-lo entre try/catch
	 * @param senha
	 * @throws SenhaInvalidaException
	 */
	public static void autenticar(String senha) throws SenhaInvalidaException{
		if("123".equals(senha)){
			System.out.println("Autenticado");
		}else{
			throw new SenhaInvalidaException("Senha Incorreta, tente novamente.  \n");
		}
	}

	public static void main(String[] args)  {
		boolean continua = true;
		Scanner s = new Scanner(System.in);
		int i = 0;
		do
		{
			try {
				System.out.print("Digite a senha: ");
				autenticar(s.next());
				continua = false;
			} catch (SenhaInvalidaException e) {			
				System.err.println(e.getMessage()); //Recupera mensagem de erro					
			}
			finally {				
				i++;				
			}
		}while (continua);
		s.close();
		System.out.println("Você tentou "+i+" vez (es)");
		
	}

}
