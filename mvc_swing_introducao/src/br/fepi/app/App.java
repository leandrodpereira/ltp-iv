package br.fepi.app;

import br.fepi.controller.ControllerCadastroCliente;
import br.fepi.view.CadastroCliente;

public class App {

	public static void main(String[] args) {
		new ControllerCadastroCliente(new CadastroCliente());

	}

}
