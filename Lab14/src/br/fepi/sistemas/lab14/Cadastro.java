package br.fepi.sistemas.lab14;

public class Cadastro {
	
		
	private int id;
	private EstadosSudeste estado;
	private Semana diaTrabalho;
	private EstadoCivil estadoCivil;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EstadosSudeste getEstado() {
		return estado;
	}
	public void setEstado(EstadosSudeste estado) {
		this.estado = estado;
	}
	public Semana getDiaTrabalho() {
		return diaTrabalho;
	}
	public void setDiaTrabalho(Semana diaTrabalho) {
		this.diaTrabalho = diaTrabalho;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", estado=" + estado + ", diaTrabalho=" + diaTrabalho + ", estadoCivil="
				+ estadoCivil + "]";
	}	
	
}
