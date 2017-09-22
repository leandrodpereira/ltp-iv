package br.fepi.si.tratarErros;

import java.util.Scanner;

public class SenhaApp {
	/**
	 * M�todo que lan�a exce��es pr�pria. Ao cham�-lo ser� obrigat�rio lan�ar 
	 * ou coloc�-lo entre try/catch
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
		System.out.println("Voc� tentou "+i+" vez (es)");
		
	}

}
