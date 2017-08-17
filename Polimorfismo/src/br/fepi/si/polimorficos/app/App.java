package br.fepi.si.polimorficos.app;

import java.util.ArrayList;
import java.util.List;

import br.fepi.si.polimorficos.Cubo;
import br.fepi.si.polimorficos.Forma;
import br.fepi.si.polimorficos.Quadrado;
import br.fepi.si.polimorficos.Retangulo;

public class App {

	public static void main(String[] args) {
		Quadrado q = new Quadrado("Azul", 2, 5);
		Retangulo r = new Retangulo("Verde", 1, 4, 3);
		Cubo c = new Cubo("Amarelo", 2, 5);
		
		List<Forma> formasGeometricas = new ArrayList<>();
		
		formasGeometricas.add(q);
		formasGeometricas.add(r);
		formasGeometricas.add(c);
		
		for (Forma f : formasGeometricas) {
			
			System.out.print("Área do "+
					f.getClass().getSimpleName()+": ");
			f.calculoDeArea();
			System.out.println(f.toString()+"\n");
		}
		
		
		
	}

}
