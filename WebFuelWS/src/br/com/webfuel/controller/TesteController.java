package br.com.webfuel.controller;


import java.util.Date;

import br.com.webfuel.dao.entities.TesteDAO;
import br.com.webfuel.dao.entities.TesteDAOImpl;
import br.com.webfuel.exceptions.WebFuelBusinessException;
import br.com.webfuel.model.Teste;

public class TesteController {

	private TesteDAO testeDAO;
	
	public TesteController(){
		
		if(testeDAO==null){
			
			testeDAO = new TesteDAOImpl();
			
		}
		
	}
	
	public void insertTesteController(String description) throws WebFuelBusinessException, Exception{
		
		if((description == null) || (description.isEmpty())){
			
			throw new WebFuelBusinessException("'Desctiption' field cannot be empty.");
			
		}
		
		Teste testeOut = new Teste();
		
		testeOut.setDescricao(description);
		testeOut.setDtRegistro(new Date(System.currentTimeMillis()));
		testeDAO.save(testeOut);
		
	}
	
	 
	
}
