package br.gov.pe.bezerros.application.bean;

import java.util.List;
import br.gov.pe.bezerros.application.bean.util.Atracao;

public class Baile extends Atracao {
	private List<String> atracoes;
	private String contato;

	public List<String> getAtracoes() {
		return this.atracoes;
	}

	public void setAtracoes(List<String> atracoes) {
		this.atracoes = atracoes;
	}

	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
}
