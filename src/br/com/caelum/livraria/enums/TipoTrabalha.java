package br.com.caelum.livraria.enums;

public enum TipoTrabalha {
	SIM("Sim"), NAO("n�o"),;

	private String tipo;

	private TipoTrabalha(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}

}
