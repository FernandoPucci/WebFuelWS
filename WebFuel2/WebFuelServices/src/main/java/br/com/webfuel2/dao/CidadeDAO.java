package br.com.webfuel2.dao;

import java.util.List;

import br.com.webfuel2.entities.model.Cidade;
import br.com.webfuel2.entities.model.dto.CidadeEstadoDTO;

public interface CidadeDAO extends BaseDAO<Cidade, Integer> {

	@Override
	public Cidade save(Cidade entity);

	@Override
	public void remove(Cidade entity);
	
	public List<Cidade> getAllCidadeByIdEstado(Integer idEstado);
	
	public List<CidadeEstadoDTO> getAllCidadeEstadoDescricaoByIdEstado(Integer idEstado);
	
}
