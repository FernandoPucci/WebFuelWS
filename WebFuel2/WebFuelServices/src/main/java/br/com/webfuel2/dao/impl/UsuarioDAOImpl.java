package br.com.webfuel2.dao.impl;

import javax.persistence.TypedQuery;

import br.com.webfuel2.dao.UsuarioDAO;
import br.com.webfuel2.entities.model.Usuario;

public class UsuarioDAOImpl extends BaseDAOImpl<Usuario, Integer> implements UsuarioDAO {

	@Override
	public Usuario findUsuarioByIdFacebookDAO(Long idFacebook) {

		Usuario usuario = null;

		TypedQuery<Usuario> query = manager.createQuery(
				"SELECT U " + " FROM Usuario U " + " where  U.idFacebook  = :idFacebookQuery", Usuario.class);

		query.setParameter("idFacebookQuery", idFacebook);

		usuario = query.getSingleResult();

		return usuario;

	}

}
