package br.com.webfuel2.entities.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
public class Usuario {

	private Integer idUsuario;

	private Long idFacebook;

	private char sexo;

	@JsonProperty("first_name")
	private String nome;

	@JsonProperty("last_name")
	private String sobrenome;

	private String email;

	@JsonProperty("profile_pic")
	private String fotoPath;

	@SuppressWarnings("unused")
	private String gender;
	@SuppressWarnings("unused")
	private String first_name;
	@SuppressWarnings("unused")
	private String profile_pic;
	@SuppressWarnings("unused")
	private String last_name;

	public Usuario() {

	}

	public Usuario(Integer idUsuario, Long idFacebook, char sexo, String nome, String sobrenome, String email,
			String fotoPath) {
		super();
		this.idUsuario = idUsuario;
		this.idFacebook = idFacebook;
		this.sexo = sexo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.fotoPath = fotoPath;
	}

	// Facebook JSON
	// public void setGender(String gender) {
	// this.sexo = gender.equalsIgnoreCase("male") ? 'M' :
	// gender.equalsIgnoreCase("female") ? 'F' : 'X';
	// }
	//
	// public void setFirst_name(String first_name) {
	// this.nome = first_name;
	// }
	//
	// public void setProfile_pic(String profile_pic) {
	// this.fotoPath = profile_pic;
	// }
	//
	// public void setLast_name(String last_name) {
	// this.sobrenome = last_name;
	// }

	///

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdFacebook() {
		return idFacebook;
	}

	public void setIdFacebook(Long idFacebook) {
		this.idFacebook = idFacebook;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@JsonProperty("gender")
	public void setSexo(String sexo) {
		this.sexo = sexo.equalsIgnoreCase("male") ? 'M' : sexo.equalsIgnoreCase("female") ? 'F' : 'X';

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFotoPath() {
		return fotoPath;
	}

	public void setFotoPath(String fotoPath) {
		this.fotoPath = fotoPath;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", idFacebook=" + idFacebook + ", sexo=" + sexo + ", nome=" + nome
				+ ", sobrenome=" + sobrenome + ", email=" + email + ", fotoPath=" + fotoPath + "]";
	}

}
