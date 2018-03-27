package br.fepi.sistemas.lab11b;

public class EquacaoPell {
	
	private int somaPassos, resultado, impar=1;
	/**
	 * 
	 * @param valor
	 * @return parte inteira de uma raiz quadrada
	 */
	public int raizInteira (int valor){
		do{
			resultado = (valor-=impar); // Valor digitado - numero impar;
			impar += 2; 
			somaPassos++; //Contabiliza os passos;
		}while (resultado >= impar);
						
	return somaPassos;
	}
	

}
