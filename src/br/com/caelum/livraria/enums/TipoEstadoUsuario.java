package br.com.caelum.livraria.enums;

public enum TipoEstadoUsuario {

	ATIVO("Ativo"), INATIVO("Inativo"), AGUARDANDO("Aguardando");

	private String tipo;

	private TipoEstadoUsuario(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}

}
