package br.com.webfuel2.entities.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "TESTE")
public class TestModel {

	@Id
	@Column(name = "ID_TESTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTeste;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "SOBRENOME")
	private String sobrenome;

	@Column(name = "DT_REG")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataAtual;

	public TestModel() {

		this.dataAtual = new Date();
	}

	public Integer getIdTeste() {
		return idTeste;
	}

	public void setIdTeste(Integer idTeste) {
		this.idTeste = idTeste;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	public Date getDataAtual() {
		return dataAtual;
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

	@Override
	public String toString() {
		return "TestModel [nome=" + nome + ", sobrenome=" + sobrenome + ", dataAtual=" + dataAtual + "]";
	}

}
