package br.com.webfuel2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.webfuel2.dao.TesteDAO;
import br.com.webfuel2.entities.model.TestModel;

/**
 * 
 * Classe controladora representando camada intermediária para DAO
 * 
 * @author fernando-pucci
 *
 */
@Controller
public class TestServicesController {

	/**
	 * IoC diretamente para camada DAO
	 */
	@Autowired
	TesteDAO testeDAO;

	public void testarSpringServiceController(TestModel testModel) {

		testeDAO.save(testModel);

	}

	public void testarSpringServiceSaveController(TestModel testModel) {

		testeDAO.save(testModel);

	}

	public List<TestModel> testarSpringServiceListController() {

		return testeDAO.getAll(TestModel.class);

	}

	public TestModel testarSpringServiceFindByIdController(Integer id) {

		return testeDAO.getById(TestModel.class, id);

	}

}
