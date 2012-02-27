package br.gov.pe.bezerros.application;

import br.gov.pe.bezerros.application.bean.Baile;
import br.gov.pe.bezerros.application.control.ControladorBaile;

public class Fachada {
	private static Fachada fachada;
	
	private Fachada() {}
	
	public static Fachada getInstance() {
		if(fachada==null)
			fachada = new Fachada();
		return fachada;
	}
	
	public Baile obterBaile(int codigo) {
		return ControladorBaile.getInstace().obter(codigo);
	}
}
