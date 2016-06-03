package br.com.webfuel2.testers;

import static org.junit.Assert.*;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.webfuel2.controller.LoginController;
import br.com.webfuel2.entities.model.Cidade;
import br.com.webfuel2.entities.model.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "configuration/applicationContextTester.xml" })
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class LoginControllerTester {

	@Autowired
	LoginController loginController;

	@Test
	public void salvarUsuarioControllerTester() {

		Usuario usuario = new Usuario();

		usuario.setNome("José");
		usuario.setSobrenome("da Silva");
		usuario.setFotoPath("https://graph.facebook.com/101534452842452521/picture?width=200&height=150");
		usuario.setIdFacebook(10153445436356366L);
		usuario.setSexo('M');
		usuario.setCidade(new Cidade(9123));
		usuario.setEmail("teste@gmail.com");

		loginController.salvarUsuarioController(usuario);

	}

	@Test
	public void getUsuarioByIdControllerTester() {

		Usuario usuario = null;

		usuario = loginController.getUsuarioByIdController(99999);

		assertNotNull(usuario);
		assertNotNull(usuario.getCidade());

		System.out.println(usuario.toString());

	}

	@Test
	public void listAllUsuariosControllerTester() {

		List<Usuario> listaRetorno = null;

		listaRetorno = loginController.listAllUsuariosController();

		assertNotNull(listaRetorno);
		assertFalse(listaRetorno.isEmpty());

		for (Usuario u : listaRetorno) {

			System.out.println(u.toString());

		}

	}

	@Test
	public void findUsuarioByIdFacebookControllerTester() {

		Usuario usuario = null;

		usuario = loginController.findUsuarioByIdFacebookController(10153445436356366L);

		assertNotNull(usuario);
		assertNotNull(usuario.getCidade());

		System.out.println(usuario.toString());
	}

}
