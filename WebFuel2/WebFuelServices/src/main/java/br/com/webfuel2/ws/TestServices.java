package br.com.webfuel2.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.webfuel2.business.TransacaoBo;
import br.com.webfuel2.dao.TesteDAO;
import br.com.webfuel2.entities.model.TestModel;

@Path("/")
@Controller
public class TestServices {

	@Autowired
	TransacaoBo transacaoBo;
	
	@Autowired
	TesteDAO testeDAO;
	
	@GET
	@Path("/testar")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testarRESTService() {
		String result = "Servicos REST funcionando corretamente..";

		// retorna HTTP response 200 Sucesso
		return Response.status(200).entity(result).build();
	}

	@GET
	@Path("/testarDB")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testarSpringService() {
		
		TestModel tm = new TestModel();
		
		tm.setIdTeste(1);
		tm.setNome("Fernando");
		tm.setSobrenome("Silva Pucci");
		testeDAO.save(tm);

		// retorna HTTP response 200 Sucesso
		return Response.status(200).entity("Sucesso").build();
	}

	@GET
	@Path("/testarSpring")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testarDBService() {
		
		String result = transacaoBo.save();

		// retorna HTTP response 200 Sucesso
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/testarObjetos")
	@Produces(MediaType.APPLICATION_JSON)
	public TestModel testarRESTServiceObj() {

		TestModel tm = new TestModel();
		tm.setNome("Nome");
		tm.setSobrenome("da Silva");
	
		return tm;
	}

}
