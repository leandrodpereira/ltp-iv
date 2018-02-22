package br.fepi;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

@Documented
@Target(TYPE)
public @interface Cabecalho {
	
	String empresa();
	String projeto();
	String data();
	String criador();
	int revisão();	
	
	
}
