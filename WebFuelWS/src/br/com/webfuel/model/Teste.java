package br.com.webfuel.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@SuppressWarnings("serial")
@Entity
@Table(name = "TESTE")
@DynamicUpdate(true)
@SelectBeforeUpdate(true)
public class Teste implements java.io.Serializable {

	@Id
	@Column(name = "ID_TESTE", unique = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="teste_seq")
	@SequenceGenerator(name = "teste_seq", sequenceName = "TESTE_PK_SEQ", allocationSize = 1)
	private Integer idTeste;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_REG")
	private Date dtRegistro;

	public Integer getIdTeste() {
		return idTeste;
	}

	public void setIdTeste(Integer idTeste) {
		this.idTeste = idTeste;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtRegistro() {
		return dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	@Override
	public String toString() {
		return "Teste [idTeste=" + idTeste + ", descricao=" + descricao + ", dtRegistro=" + dtRegistro + "]";
	}

}
