package br.fepi.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * View contento apenas componentes de interface
 */
public class CadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel lblIdCliente;
	private JLabel lblNomeCliente;
	private JLabel lblCpfCliente;
	private JTextField idCliente;
	private JTextField nomeCliente;
	private JTextField cpfCliente;
	private JButton salvar;
	private JButton cancelar;

	public CadastroCliente() {

		this.lblIdCliente = new JLabel("ID: ");
		this.lblNomeCliente = new JLabel("NOME: ");
		this.lblCpfCliente = new JLabel("CPF: ");
		this.salvar = new JButton("Salvar");

		this.idCliente = new JTextField();
		this.nomeCliente = new JTextField();
		this.cpfCliente = new JTextField();
		this.cancelar = new JButton("Cancelar");

		this.add(lblIdCliente);
		this.add(idCliente);
		this.add(lblNomeCliente);
		this.add(nomeCliente);
		this.add(lblCpfCliente);
		this.add(cpfCliente);
		this.add(salvar);
		this.add(cancelar);

		this.setTitle("Cadastro de Clientes");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(4, 4));

	}

	public JLabel getLblIdCliente() {
		return lblIdCliente;
	}

	public void setLblIdCliente(JLabel lblIdCliente) {
		this.lblIdCliente = lblIdCliente;
	}

	public JLabel getLblNomeCliente() {
		return lblNomeCliente;
	}

	public void setLblNomeCliente(JLabel lblNomeCliente) {
		this.lblNomeCliente = lblNomeCliente;
	}

	public JLabel getLblCpfCliente() {
		return lblCpfCliente;
	}

	public void setLblCpfCliente(JLabel lblCpfCliente) {
		this.lblCpfCliente = lblCpfCliente;
	}

	public JTextField getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(JTextField idCliente) {
		this.idCliente = idCliente;
	}

	public JTextField getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(JTextField nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public JTextField getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(JTextField cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public JButton getSalvar() {
		return salvar;
	}

	public void setSalvar(JButton salvar) {
		this.salvar = salvar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

}
