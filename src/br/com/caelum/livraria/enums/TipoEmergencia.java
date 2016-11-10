package br.com.caelum.livraria.enums;

public enum TipoEmergencia {
	PAIDOBEBE("PaiDoBebe"), MINHAMAE("MinhaMae"), VIZINHA("Vizinha"), OUTROS("Outros"),;

	private String tipo;

	private TipoEmergencia(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}

}
