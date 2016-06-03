package br.com.webfuel2.entities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
@Entity
@Table(name = "USUARIO")
@JsonAutoDetect
public class Usuario {

	@Id
	@Column(name = "ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;

	@Column(name = "ID_FACEBOOK")
	private Long idFacebook;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CIDADE")	
	private Cidade cidade; 

	@Column(name = "SEXO")
	private char sexo;

	
	@JsonProperty("first_name")
	@Column(name = "NOME")
	private String nome;

	@JsonProperty("last_name")
	@Column(name = "SOBRENOME")
	private String sobrenome;

	@Column(name = "EMAIL")
	private String email;

	@JsonProperty("profile_pic")
	@Column(name = "FOTO")
	private String fotoPath;

	public Usuario() {

	}
	
	public Usuario(Integer idUsuario, Long idFacebook, Cidade cidade, char sexo, String nome, String sobrenome,
			String email, String fotoPath) {
		super();
		this.idUsuario = idUsuario;
		this.idFacebook = idFacebook;
		this.cidade = cidade;
		this.sexo = sexo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.fotoPath = fotoPath;
	}

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
		this.nome = nome.toUpperCase();
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome.toUpperCase();;
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


	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", idFacebook=" + idFacebook + ", cidade=" + cidade + ", sexo="
				+ sexo + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", fotoPath=" + fotoPath
				+ "]";
	}

	
	

}
