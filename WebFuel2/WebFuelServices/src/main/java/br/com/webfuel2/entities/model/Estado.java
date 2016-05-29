package br.com.webfuel2.entities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@XmlRootElement
@Entity
@Table(name = "ESTADO")
@JsonAutoDetect
public class Estado {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstado;

	@Column(name = "UF")
	private String uf;

	@Column(name = "NOME")
	private String descricao;
	
	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDescricao() {
		return descricao != null ? descricao.toUpperCase() : "--";
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", uf=" + uf + ", descricao=" + descricao + "]";
	}

}
