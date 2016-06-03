package br.com.webfuel2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.webfuel2.dao.UsuarioDAO;
import br.com.webfuel2.entities.model.Usuario;

@Controller
public class LoginController {

	@Autowired
	UsuarioDAO usuarioDAO;

	public void salvarUsuarioController(Usuario usuario) {

		usuarioDAO.save(usuario);

	}

	public Usuario getUsuarioByIdController(Integer id) {

		Usuario usuario = null;

		usuario = usuarioDAO.getById(Usuario.class, id);

		return usuario;

	}

	public List<Usuario> listAllUsuariosController() {

		List<Usuario> listaRetorno = null;

		listaRetorno = usuarioDAO.getAll(Usuario.class);

		return listaRetorno;

	}
	
	public Usuario findUsuarioByIdFacebookController(Long idFacebook){
				
		Usuario usuario = null;
		
		usuario = usuarioDAO.findUsuarioByIdFacebookDAO(idFacebook);
		
		return usuario; 
		
		
	}
	

	
	
}
