package br.fepi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.fepi.model.Cliente;
import br.fepi.view.CadastroCliente;

/**
 *Controller que integra a camada Model e View  
 */
public class ControllerCadastroCliente implements ActionListener {

	private CadastroCliente cadastroCliente;
	private Cliente cliente;

	public ControllerCadastroCliente(CadastroCliente cadastroCliente) {
		this.cadastroCliente = cadastroCliente;

		this.cadastroCliente.getSalvar().addActionListener(this);
		this.cadastroCliente.getCancelar().addActionListener(this);

		this.cliente = new Cliente();
	}

	public void limparFormulario() {
		this.cadastroCliente.getIdCliente().setText(null);
		this.cadastroCliente.getNomeCliente().setText(null);
		this.cadastroCliente.getCpfCliente().setText(null);
	}

	public void gravar() {
		this.cliente.setId(Integer.parseInt(this.cadastroCliente.getIdCliente().getText()));
		this.cliente.setNome(this.cadastroCliente.getNomeCliente().getText());
		this.cliente.setCpf(this.cadastroCliente.getCpfCliente().getText());
		System.out.println(cliente.toString());
		this.cliente = new Cliente();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.cadastroCliente.getCancelar())
			this.limparFormulario();

		if (e.getSource() == this.cadastroCliente.getSalvar()) {
			this.gravar();
			this.limparFormulario();
		}

	}

}
