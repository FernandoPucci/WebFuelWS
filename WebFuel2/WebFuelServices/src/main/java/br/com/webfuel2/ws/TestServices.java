package br.com.webfuel2.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.webfuel2.business.TransacaoBo;
import br.com.webfuel2.dao.TesteDAO;
import br.com.webfuel2.entities.model.TestModel;

/**
 * @author fernando-pucci
 *
 *         Classe para exposição de serviços de Teste REST utilizando a entidade
 *         Model 'TestModel'
 *
 */
@Path("/")
@Controller
public class TestServices {

	/**
	 * Objeto para teste da inversão de controle (IoC) do Spring Frameqork
	 */
	@Autowired
	TransacaoBo transacaoBo;

	/**
	 * IoC diretamente para camada DAO
	 */
	@Autowired
	TesteDAO testeDAO;

	/**
	 * Verifica se os serviços REST estão corretamente funcionais
	 * 
	 * @return
	 */
	@GET
	@Path("/testar")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testarRESTService() {
		String result = "Servicos REST funcionando corretamente..";

		// retorna HTTP response 200 Sucesso
		return Response.status(200).entity(result).build();
	}

	/**
	 * Utiliza chamada hibernate para gravação de dado padrão na base de dados
	 * (tabela TESTE)
	 * 
	 * @return
	 */
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

	/**
	 * 
	 * Recebe um objeto JSON e tenta persistí-lo na base de dados
	 * 
	 * @param tm
	 * @return
	 */
	@POST
	@Path("/testarDBInput")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response testarSpringServiceSave(TestModel tm) {

		testeDAO.save(tm);

		// retorna HTTP response 200 Sucesso
		return Response.status(200).entity("Sucesso [" + tm.getNome() + " " + tm.getSobrenome() + "] cadastrado!")
				.build();
	}

	/**
	 * Lista todos objetos TestModel na base de dados (tabela TESTE)
	 * 
	 * @return
	 */
	@GET
	@Path("/testarDBList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TestModel> testarSpringServiceList() {

		return testeDAO.getAll(TestModel.class);

	}

	/**
	 * Consulta através de método GET os valores de determinado ID
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/testarDBFindById")
	@Produces(MediaType.APPLICATION_JSON)
	public TestModel testarSpringServiceFindById(@QueryParam("id") Integer id) {

		return testeDAO.getById(TestModel.class, id);

	}

	/**
	 * 
	 * Testa IoC do Spring
	 * 
	 * @return
	 */
	@GET
	@Path("/testarSpring")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testarSpringServiceSimple() {

		String result = transacaoBo.save();

		// retorna HTTP response 200 Sucesso
		return Response.status(200).entity(result).build();
	}

	/**
	 * Testa retono de objeto sem necessidade de acesso ao Banco
	 * 
	 * @return
	 */
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
