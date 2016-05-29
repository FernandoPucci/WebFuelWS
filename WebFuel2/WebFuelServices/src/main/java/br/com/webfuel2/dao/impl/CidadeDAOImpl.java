package br.com.webfuel2.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.webfuel2.dao.CidadeDAO;
import br.com.webfuel2.entities.model.Cidade;
import br.com.webfuel2.entities.model.dto.CidadeEstadoDTO;

public class CidadeDAOImpl extends BaseDAOImpl<Cidade, Integer> implements CidadeDAO {

	@Override
	public Cidade save(Cidade entity) {

		throw new IllegalAccessError("Voce nao pode adicionar novos itens a Cidade");

	}

	@Override
	public void remove(Cidade entity) {
		throw new IllegalAccessError("Voce nao pode remover itens de Cidade");
	}

	@Override
	public List<Cidade> getAllCidadeByIdEstado(Integer idEstado) {

		List<Cidade> listaSaida = null;

		TypedQuery<Cidade> query = manager
				.createQuery("SELECT C " + " FROM Cidade C " + " where  C.idEstado  = :idEstadoQuery", Cidade.class);

		query.setParameter("idEstadoQuery", idEstado);

		listaSaida = query.getResultList();

		return listaSaida;

	}

	@Override
	public List<CidadeEstadoDTO> getAllCidadeEstadoDescricaoByIdEstado(Integer idEstado) {

		List<CidadeEstadoDTO> listaSaida = null;

		TypedQuery<CidadeEstadoDTO> query = manager.createQuery(
				"SELECT C, E" + " FROM Cidade C, Estado E " + " where  C.idEstado  = :idEstadoQuery",
				CidadeEstadoDTO.class);

		query.setParameter("idEstadoQuery", idEstado);

		listaSaida = query.getResultList();

		return listaSaida;

	}

}
