package br.com.webfuel2.dao;

import br.com.webfuel2.entities.model.Usuario;

public interface UsuarioDAO extends BaseDAO<Usuario, Integer> {

	public Usuario findUsuarioByIdFacebookDAO(Long idFacebook);
	
	
}
