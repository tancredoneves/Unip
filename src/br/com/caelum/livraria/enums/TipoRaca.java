package br.com.caelum.livraria.enums;

public enum TipoRaca {
	BRANCA("Branca"), PRETA("Preta"), AMARELA("Amarela"), PARDA("Parda"), INDIGENA("Indigéna"),;

	private String tipo;

	private TipoRaca(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}
}
