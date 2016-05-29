package br.com.webfuel2.entities.model.dto;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import br.com.webfuel2.entities.model.Cidade;
import br.com.webfuel2.entities.model.Estado;

@XmlRootElement
@JsonAutoDetect
public class CidadeEstadoDTO {

	private Cidade cidade;

	private Estado estado;

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "CidadeEstadoDTO [cidade=" + cidade + ", estado=" + estado + "]";
	}

}
