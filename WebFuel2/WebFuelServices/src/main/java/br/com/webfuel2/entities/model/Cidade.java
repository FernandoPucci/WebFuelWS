package br.com.webfuel2.entities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@XmlRootElement
@Entity
@Table(name = "CIDADE")
@JsonAutoDetect
public class Cidade {

	public Cidade() {

	}

	public Cidade(Integer idCidade) {

		this.idCidade = idCidade;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCidade;

	@Column(name = "ID_ESTADO")
	@JoinTable(name = "ESTADO")
	private Integer idEstado;

	@Column(name = "UF")
	private String uf;

	@Column(name = "NOME")
	private String nome;

	public Integer getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getUf() {
		return uf != null ? uf.toUpperCase() : "--";
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome != null ? nome.toUpperCase() : "--";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cidade [idCidade=" + idCidade + ", idEstado=" + idEstado + ", uf=" + uf + ", nome=" + nome + "]";
	}

}
