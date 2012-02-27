package br.gov.pe.bezerros.application.control;

import br.gov.pe.bezerros.application.bean.Baile;
import br.gov.pe.bezerros.application.persistence.RepositorioBaile;

public class ControladorBaile {
	private static ControladorBaile controladorBaile;
	
	private ControladorBaile() {}
	
	public static ControladorBaile getInstace() {
		if(controladorBaile==null)
			controladorBaile = new ControladorBaile();
		return controladorBaile;
	}
	
	public Baile obter(int codigo) {
		return RepositorioBaile.getInstance().obter(codigo);
	}
}
