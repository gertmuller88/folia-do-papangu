package br.gov.pe.bezerros.application.bean;

import br.gov.pe.bezerros.application.bean.util.Atracao;

public class Show extends Atracao {
	private int duracao;
	private String banda;

	public int getDuracao() {
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getBanda() {
		return this.banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}
}
