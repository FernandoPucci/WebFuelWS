package br.com.webfuel2.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import br.com.webfuel2.entities.model.Usuario;

@Path("/login")
@Service
public class LoginServices {

	@POST
	@Path("/setDadosUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response setDadosUsuarioSservice(Usuario usuario) {

		if (usuario == null) {

			return Response.status(500).entity("Usuário inválido").build();
		}

		try {

			
			System.out.println(usuario.toString());
			return Response.status(200).entity("SUCESSO: " + usuario.toString()).build();

		} catch (Exception ex) {

			return Response.status(500).entity("Usuário inválido").build();
		}

	}
}
