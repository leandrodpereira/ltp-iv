package br.fepi.model;

public class Ciclista {	
	
	public Ciclista(int id, String nome, String pais, char sexo, Bicicleta bicicleta) {
		
		setId(id);
		setNome(nome);
		setPais(pais);
		setSexo(sexo);
		setBicicleta(bicicleta);
	}
	
	private int id;
	private String nome; 
	private String pais;	
	private char sexo;
	private Bicicleta bicicleta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}	
	
}
