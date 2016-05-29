package br.com.webfuel2.testers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.webfuel2.controller.DbUtilsController;
import br.com.webfuel2.entities.model.Cidade;
import br.com.webfuel2.entities.model.Estado;
import br.com.webfuel2.entities.model.dto.CidadeEstadoDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "configuration/applicationContextTester.xml" })
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class DbUtilsControllerTester {

	@Autowired
	DbUtilsController dbUtilsController;

	// Estados
	@Test
	public void getAllEstadosTester() {

		List<Estado> listaSaida = null;

		listaSaida = dbUtilsController.getAllEstados();

		assertNotNull(listaSaida);

		assertTrue(listaSaida.size() == 27);

		System.out.println("Lista Retornou: [" + listaSaida.size() + "] resultados.");

	}

	@Test
	public void getEstadoByIdTester() {

		Estado estado = null;

		for (int i = 1; i <= 27; i++) {

			estado = dbUtilsController.getEstadoById(i);
			System.out.println(estado.toString());
			assertNotNull(estado);

		}

	}

	@Test(expected = IllegalAccessError.class)
	public void saveEstado() {

		Estado estado = new Estado();

		dbUtilsController.saveEstado(estado);
	}

	@Test(expected = IllegalAccessError.class)
	public void removerEstado() {

		Estado estado = new Estado();

		dbUtilsController.removerEstado(estado);

	}
	// Cidades

	@Test
	public void getAllCidadesTester() {

		List<Cidade> listaSaida = null;

		listaSaida = dbUtilsController.getAllCidades();

		assertNotNull(listaSaida);

		assertTrue(listaSaida.size() > 0);

		System.out.println("Lista Retornou: [" + listaSaida.size() + "] resultados.");

	}

	@Test
	public void getCidadeByIdTester() {

		Cidade cidade = null;

		for (int i = 1; i <= 50; i++) {

			cidade = dbUtilsController.getCidadeById(i);
			System.out.println(cidade.toString());
			assertNotNull(cidade);

		}

	}

	@Test(expected = IllegalAccessError.class)
	public void saveCidade() {

		Cidade cidade = new Cidade();

		dbUtilsController.saveCidade(cidade);
	}

	@Test(expected = IllegalAccessError.class)
	public void removerCidade() {

		Cidade cidade = new Cidade();

		dbUtilsController.removerCidade(cidade);

	}

	@Test
	public void getAllCidadeByIdEstadoControllerTester() {

		List<Cidade> listaSaida = null;

		listaSaida = dbUtilsController.getAllCidadeByIdEstadoController(11);

		assertNotNull(listaSaida);
		assertTrue(listaSaida.size() > 0);

		System.out.println("Lista Retornou: [" + listaSaida.size() + "] resultados.");

	}

	
}
