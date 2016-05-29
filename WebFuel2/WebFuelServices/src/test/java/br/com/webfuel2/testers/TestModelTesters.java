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

import br.com.webfuel2.controller.TestServicesController;
import br.com.webfuel2.entities.model.TestModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "configuration/applicationContextTester.xml" })
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class TestModelTesters {

	@Autowired
	TestServicesController testServicesController;

	@Test
	public void testGetList() {

		List<TestModel> listaSaida = null;

		listaSaida = testServicesController.testarSpringServiceListController();

		assertNotNull(listaSaida);

		assertTrue(listaSaida.size() > 0);

	}

	@Test
	public void testGetById() {

		TestModel saida = null;

		saida = testServicesController.testarSpringServiceFindByIdController(1);

		assertNotNull(saida);
		assertNotNull(saida.toString());
	}
	
	@Test
	public void testSave(){
		
		TestModel testeSave = new TestModel();
		
		testeSave.setNome("BaduBadu");
		testeSave.setSobrenome("Rizengrabeer");
		
		testServicesController.testarSpringServiceSaveController(testeSave);
				
		
	}

}
