package com.br.zup;

public class Item {
  
	private String nome;
	 String categoria;
	
	
	
	public Item(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
			
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
