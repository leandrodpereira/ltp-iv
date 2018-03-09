package br.fepi.si.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		String nome = "br.fepi.si.ClasseModelo";
		Class c = Class.forName(nome);
		System.out.println(c.getSimpleName());
		
		Field[] f = c.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		Method[] m = c.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method.getName());
		}
		
		Constructor[] con = c.getConstructors();
		for (Constructor constructor : con) {
			System.out.println(constructor);
		}
		
		Object o = c.newInstance(); //carregando uma nova instancia de ClasseModelo
		Method m1 = c.getMethod("setPeso", double.class);//carregando um método
		m1.invoke(o, 59.6);//executando o método carregado anteriormente
		
		Method m2 = c.getMethod("toString");
		System.out.println(m2.invoke(o));
		
		Constructor c1 = c.getConstructor
				(String.class, double.class, boolean.class);//carregando um construtor
		
		//carregando uma nova instancia de ClasseModelo através de um construtor
		Object oc = c1.newInstance("Leandro", 72.4, true);
		System.out.println(m2.invoke(oc));
	}

}
