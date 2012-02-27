package br.gov.pe.bezerros.application.bean.util;

public enum Local {
	CLRB(1, "Clube Liter�rio Rui Barbosa"),
	QGFrevo(2, "QG do Frevo"),
	SaoSebastiao(3, "Pra�a S�o Sebasti�o");

	private final int codigo;
	private final String local;

	private Local(int codigo, String local) {
		this.codigo = codigo;
		this.local = local;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getLocal() {
		return this.local;
	}
}
