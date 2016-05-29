package br.com.webfuel2.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webfuel2.controller.DbUtilsController;
import br.com.webfuel2.entities.model.Cidade;
import br.com.webfuel2.entities.model.Estado;

@Path("/utils")
@Service
public class DbUtilsServices {

	@Autowired
	DbUtilsController dbUtilsController;

	@GET
	@Path("/listAllEstados")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Estado> listAllEstadosService() {

		return dbUtilsController.getAllEstados();
	}

	@GET
	@Path("/listAllCidades")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cidade> listAllCidadesService() {

		return dbUtilsController.getAllCidades();
	}

	@GET
	@Path("/listAllCidadesByIdEstado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Cidade> listAllCidadesByIdEstadoService(@QueryParam("idEstado") Integer id) {

		return dbUtilsController.getAllCidadeByIdEstadoController(id);
	}

}
