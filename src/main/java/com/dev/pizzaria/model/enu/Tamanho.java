package com.dev.pizzaria.model.enu;

public enum Tamanho {

	SUPER("Super"),
	MARACANA("Maracanã"),
	GRANDE("Grande"),
	MEDIA("Média"),
	PEQUENA("Pequena");
	
	private String descricao;
	
	Tamanho(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
