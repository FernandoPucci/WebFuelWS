package br.com.webfuel.ws;

import javax.jws.*;

@WebService
public class WebFuelLogin {

	@WebMethod(operationName = "sayHello", action = "hello")
	public String hello(@WebParam(name = "nome", targetNamespace = "webfuel.com.br") String nome) {
		
		 return "Teste: " + nome;
	}
}
