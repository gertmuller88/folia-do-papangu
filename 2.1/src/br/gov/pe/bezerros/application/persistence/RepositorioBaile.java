package br.gov.pe.bezerros.application.persistence;

import br.gov.pe.bezerros.application.bean.Baile;

public class RepositorioBaile {
	private static RepositorioBaile repositorioBaile;
	
	private RepositorioBaile() {}
	
	public static RepositorioBaile getInstance() {
		if(repositorioBaile==null)
			repositorioBaile = new RepositorioBaile();
		return repositorioBaile;
	}
	
	public Baile obter(int codigo) {
		Baile baile = new Baile();
		baile.setCodigo(1);
		baile.setTitulo("Baile Municipal");
		baile.setDetalhes("Baile Municipal de Bezerros");
		
		return baile;
	}
}
