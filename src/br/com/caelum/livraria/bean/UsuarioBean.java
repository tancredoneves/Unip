package br.com.caelum.livraria.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.caelum.livraria.dao.UsuarioDao;
import br.com.caelum.livraria.modelo.Usuario;
import br.com.caelum.livraria.tx.Transacional;

@Named
@ViewScoped
public class UsuarioBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	
	private Integer usuarioId;
	
	@Inject
	private UsuarioDao dao;

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	
	public void carregarUsuarioPelaId() {
		this.usuario = this.dao.buscaPorId(usuarioId);
	}
	
	
	
	@Transacional
	public String gravar() {
		System.out.println("Gravando Usuario " + this.usuario.getNome());
		
		List<Usuario> xpto = getUsuarios();
		
		//EMAIL
	

		if (this.usuario.getId() == null ) {
			this.dao.adiciona(this.usuario);
		} else {
			this.dao.atualiza(this.usuario);
		}

		this.usuario = new Usuario();

		return "login?faces-redirect=true";
	}
	
	public List<Usuario> getUsuarios() {
		return this.dao.listaTodos();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	

}
