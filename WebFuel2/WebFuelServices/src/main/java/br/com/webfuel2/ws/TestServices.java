package br.com.webfuel2.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.webfuel2.entities.model.TestModel;

@Path("/")
public class TestServices {

	@GET
	@Path("/testar")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testarRESTService() {
		String result = "Servicos REST funcionando corretamente..";

		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}

	@GET
	@Path("/testarObjetos")
	@Produces(MediaType.APPLICATION_JSON)
	public TestModel testarRESTServiceObj() {

		TestModel tm = new TestModel();
		tm.setNome("Nome");
		tm.setSobrenome("da Silva");

		// JSONObject json = new JSONObject();
		// json.put("NOME",tm.getNome());
		// json.put("SOBRENOME",tm.getSobrenome());
		// json.put("DATA",tm.getDataAtual());
		return tm;
	}

}
