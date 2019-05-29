package com.br.zup;

import java.awt.List;
import java.util.ArrayList;

public class Filme extends Item{

	public String genero;
	public int duracao;


	public Filme(  String nome, String categoria, String genero, int duracao) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		

	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDuracao() {
		return duracao;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
		
	}

	public String toString() {

		String modelo = "";
		modelo += " Nome -> " + super.getNome() + " /n";
		modelo += " categoria ->" +super.getCategoria() + "/n";
		modelo += " Genero_-> "+ this.getGenero()+ " /n";
		modelo += " duração -> " + this.getDuracao()+ "/n";
	

		return modelo;


	}
}