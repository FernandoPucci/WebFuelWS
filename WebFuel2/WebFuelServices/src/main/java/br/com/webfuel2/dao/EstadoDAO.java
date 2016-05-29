package br.com.webfuel2.dao;

import br.com.webfuel2.entities.model.Estado;

public interface EstadoDAO extends BaseDAO<Estado, Integer> {

	@Override
	public Estado save(Estado entity);

	@Override
	public void remove(Estado entity);

}
