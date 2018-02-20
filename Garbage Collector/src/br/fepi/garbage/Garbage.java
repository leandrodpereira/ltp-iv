package br.fepi.garbage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Manipula��o do Garbage Collector
 * @author lduarte
 *
 */
public class Garbage {
	
	public static long carregarMemoria(){
		List<Integer> valores = new ArrayList<>();
		for (int i = 0; i < 100_000_00; i++){
			valores.add(i);
		}
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		double GB = 1_073_741_824;		
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double totalMemoriaJvm = (rt.maxMemory() / GB);
		
		System.out.println("Total de mem�ria da JVM: "+df.format(totalMemoriaJvm)+" Gb");
		
		double inicio = totalMemoriaJvm - (carregarMemoria()/GB);
						
		System.out.println("Mem�ria em uso ap�s carregamento do m�todo: "+
				df.format(inicio)+" Gb");
		
		rt.runFinalization(); //Finaliza objetos pendentes
		rt.gc(); //Executa o Garbage Collector
		
		double fim = totalMemoriaJvm - (rt.freeMemory() / GB);
		
		System.out.println("Mem�ria em uso ao t�rmino da execu��o: "+
					df.format(fim)+" Gb");
	}
	
}
