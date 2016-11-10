package br.com.caelum.livraria.modelo;

import java.io.Serializable;
import java.util.Calendar;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.caelum.livraria.enums.TipoEstadoUsuario;
import br.com.caelum.livraria.enums.TipoEmergencia;
import br.com.caelum.livraria.enums.TipoRaca;
import br.com.caelum.livraria.enums.TipoTrabalha;


@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private String apelido;
	private String companheiro;
	@Column(columnDefinition="mediumblob")	
	private byte[] foto;
	private String celular;
	@Column(columnDefinition="tinyint(1)")
	private TipoEstadoUsuario tipoEstadoUsuario;
	@Temporal(TemporalType.DATE)
	private Calendar nascimento = Calendar.getInstance();
	private Integer idade;
	private String ocupacao;
	private String endereco;
	private String referencia;
	private String cidade;
	private String estado;
	private String cep;
	private String fixo;
	private TipoRaca tipoRaca;
	private TipoTrabalha tipoTrabalha;
	private String fora;
	private TipoEmergencia tipoEmergencia;
	private String telEmergencia;
	private String mensagem;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getCompanheiro() {
		return companheiro;
	}
	public void setCompanheiro(String companheiro) {
		this.companheiro = companheiro;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public TipoEstadoUsuario getTipoEstadoUsuario() {
		return tipoEstadoUsuario;
	}
	public void setTipoEstadoUsuario(TipoEstadoUsuario tipoEstadoUsuario) {
		this.tipoEstadoUsuario = tipoEstadoUsuario;
	}
	
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getFixo() {
		return fixo;
	}
	public void setFixo(String fixo) {
		this.fixo = fixo;
	}
	
	
	
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public String getFora() {
		return fora;
	}
	public void setFora(String fora) {
		this.fora = fora;
	}
	
	public String getTelEmergencia() {
		return telEmergencia;
	}
	public void setTelEmergencia(String telEmergencia) {
		this.telEmergencia = telEmergencia;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public TipoEmergencia getTipoEmergencia() {
		return tipoEmergencia;
	}
	public void setTipoEmergencia(TipoEmergencia tipoEmergencia) {
		this.tipoEmergencia = tipoEmergencia;
	}
	public TipoRaca getTipoRaca() {
		return tipoRaca;
	}
	public void setTipoRaca(TipoRaca tipoRaca) {
		this.tipoRaca = tipoRaca;
	}
	public TipoTrabalha getTipoTrabalha() {
		return tipoTrabalha;
	}
	public void setTipoTrabalha(TipoTrabalha tipoTrabalha) {
		this.tipoTrabalha = tipoTrabalha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	
	
	

}
