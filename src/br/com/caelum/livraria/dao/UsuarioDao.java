package br.com.caelum.livraria.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.modelo.Usuario;


public class UsuarioDao implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	EntityManager em;
	
	private DAO<Usuario> dao; 
	
	@PostConstruct
	void init() {
		this.dao = new DAO<Usuario>(this.em, Usuario.class);
	}
	
	

	public Usuario buscaPorId(Integer usuarioId) {
		return this.dao.buscaPorId(usuarioId);
	}

	public void adiciona(Usuario usuario) {
		this.dao.adiciona(usuario);
	}

	public void atualiza(Usuario usuario) {
		this.dao.atualiza(usuario);
	}

	public void remove(Usuario usuario) {
		this.dao.remove(usuario);
	}

	public List<Usuario> listaTodos() {
		return this.dao.listaTodos();
	}
	

	public boolean existe(Usuario usuario) {
		
		TypedQuery<Usuario> query = em.createQuery(
				  " select u from Usuario u "
				+ " where u.email = :pEmail and u.senha = :pSenha", Usuario.class);
		
		query.setParameter("pEmail", usuario.getEmail());
		query.setParameter("pSenha", usuario.getSenha());
		try {
			Usuario resultado =  query.getSingleResult();
		} catch (NoResultException ex) {
			return false;
		}
		
		return true;
	}
	
	

}
