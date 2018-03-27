package br.fepi.propriedades;

import java.io.Console;
import java.io.IOException;

public class Propriedades {

	public static void main(String[] args) {
		
		/*Properties p = System.getProperties();
		Set<Object> pk = p.keySet();
		
		for(Object recebePK : pk) {
			System.out.println(recebePK +" = "+p.get(recebePK));
		}*/
		
		/*Console c = System.console();
		System.out.print("User: ");
		String user = c.readLine();
		System.out.print("Password: ");
		char[] pass = c.readPassword();
		System.out.println("User: "+user+" Password: "+new String(pass));*/
		
		try {
			Runtime.getRuntime().exec("/home/lduarte/./wakeupreps.sh");			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

}
