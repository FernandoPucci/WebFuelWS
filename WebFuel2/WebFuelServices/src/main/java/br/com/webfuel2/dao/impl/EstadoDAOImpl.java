package br.com.webfuel2.dao.impl;

import br.com.webfuel2.dao.EstadoDAO;
import br.com.webfuel2.entities.model.Estado;

public class EstadoDAOImpl extends BaseDAOImpl<Estado, Integer> implements EstadoDAO {

	@Override
	public Estado save(Estado entity) {

		throw new IllegalAccessError("Voce nao pode adicionar novos itens a Estado");

	}

	@Override
	public void remove(Estado entity) {
		throw new IllegalAccessError("Voce nao pode remover itens de Estado");
	}

}
