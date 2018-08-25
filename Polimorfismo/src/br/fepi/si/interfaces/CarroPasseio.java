package br.fepi.si.interfaces;

public class CarroPasseio extends Veiculo {

	public CarroPasseio(String placa, String chassi, String marcaModelo) {
		super(placa, chassi, marcaModelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean verificaId(int numeroCaracteres) {
		if(getPlaca().length() != numeroCaracteres ) {
			return false;
		}else return true;
	}

	@Override
	public String analise(String[] roubados) {
		for (String s : roubados) {
			if (getChassi().equals(s)) {
				return "Roubado";
			}
		}
		return "Nenhuma ocorrência";
	}

}
