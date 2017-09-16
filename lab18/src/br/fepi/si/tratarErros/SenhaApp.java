package br.fepi.si.tratarErros;

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
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}

	public static void main(String[] args)  {
		
		try {
			autenticar("123e");
		} catch (SenhaInvalidaException e) {			
			System.out.println(e.getMessage()); //Recupera mensagem de erro
			e.printStackTrace();//Mostra a pilha de erros
		}

		
	}

}
