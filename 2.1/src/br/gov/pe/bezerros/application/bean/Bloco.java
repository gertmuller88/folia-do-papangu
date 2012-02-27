package br.gov.pe.bezerros.application.bean;

import java.util.List;
import br.gov.pe.bezerros.application.bean.util.Atracao;

public class Bloco extends Atracao {
	private List<String> avisos;

	public List<String> getAvisos() {
		return this.avisos;
	}

	public void setAvisos(List<String> avisos) {
		this.avisos = avisos;
	}
}
