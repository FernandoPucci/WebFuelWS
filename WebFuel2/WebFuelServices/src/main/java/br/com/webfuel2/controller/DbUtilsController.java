package br.com.webfuel2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.webfuel2.dao.CidadeDAO;
import br.com.webfuel2.dao.EstadoDAO;
import br.com.webfuel2.entities.model.Cidade;
import br.com.webfuel2.entities.model.Estado;

@Controller
public class DbUtilsController {

	@Autowired
	CidadeDAO cidadeDAO;

	@Autowired
	EstadoDAO estadoDAO;

	// Estados
	public List<Estado> getAllEstados() {

		return estadoDAO.getAll(Estado.class);

	}

	public Estado getEstadoById(Integer id) {

		return estadoDAO.getById(Estado.class, id);

	}

	public void saveEstado(Estado estado) {

		estadoDAO.save(estado);
	}

	public void removerEstado(Estado estado) {

		estadoDAO.remove(estado);
	}

	// Cidades
	public List<Cidade> getAllCidades() {

		return cidadeDAO.getAll(Cidade.class);

	}

	public Cidade getCidadeById(Integer id) {

		return cidadeDAO.getById(Cidade.class, id);

	}

	public void saveCidade(Cidade cidade) {

		cidadeDAO.save(cidade);
	}

	public void removerCidade(Cidade cidade) {

		cidadeDAO.remove(cidade);
	}

	public List<Cidade> getAllCidadeByIdEstadoController(Integer idEstado) {

		return cidadeDAO.getAllCidadeByIdEstado(idEstado);

	}
}
