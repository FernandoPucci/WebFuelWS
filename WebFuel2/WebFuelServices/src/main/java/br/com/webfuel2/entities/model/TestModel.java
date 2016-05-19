package br.com.webfuel2.entities.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestModel {

	private String nome;
	private String sobrenome;
	private Date dataAtual;

	public TestModel() {

		this.dataAtual = new Date(System.currentTimeMillis());
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
