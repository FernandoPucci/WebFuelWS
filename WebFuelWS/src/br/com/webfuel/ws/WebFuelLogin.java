package br.com.webfuel.ws;

import javax.jws.*;

import br.com.webfuel.controller.TesteController;
import br.com.webfuel.exceptions.WebFuelBusinessException;

@WebService
public class WebFuelLogin {

	@WebMethod(operationName = "sayHello", action = "hello")
	public String hello(@WebParam(name = "nome", targetNamespace = "webfuel.com.br") String nome) throws WebFuelBusinessException, Exception {
		
		TesteController testeController = new TesteController();
	
		testeController.insertTesteController(nome);
		
		 return "Teste: " + nome;
	}
}
