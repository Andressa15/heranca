package com.br.zup;

public class Livro extends Item {
	public String autor;
	public int paginas;

	public Livro(String nome, String categoria, String autor, int paginas) {
		super(nome,categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	public String toString() {

		String modelo = "";

		modelo += " Nome ->"+ super.getNome()+"/n";
		modelo += " categoria->"+ super.getCategoria()+"/n";
		modelo += " Autor _->"+ this.getAutor()+"/n";
		modelo += " Paginas->"+this.getPaginas()+"/n";

		return modelo;
	}
}
