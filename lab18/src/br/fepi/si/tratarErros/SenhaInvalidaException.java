package br.fepi.si.tratarErros;

public class SenhaInvalidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 445107224546595942L;
	
	public SenhaInvalidaException(String mensagem){
		super(mensagem);//Construtor da classe mãe
		
	}

}
