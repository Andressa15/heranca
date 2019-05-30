package com.br.zup;

import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int usuario;

		System.out.println(" Informe um numero conforme você deseja " + "\n"
				+ "(1) Adicionar Filme," + "\n"
				+ "(2) Adicionar Livro," + "\n"
			   +  "(3)Adicionar musica" );
		
		int usua = entrada.nextInt();

		if( usua == 1){
			Scanner entradaFilme = new Scanner (System.in);
			System.out.println(" Qual e o nome do filme?");
			String nome = entradaFilme.next();

			System.out.println(" Qual é categoria?");
			String categoria = entradaFilme.next();

			System.out.println(" Qual é genero do filme?");
			String genero = entradaFilme.next();

			System.out.println(" Tempo de duração?");
			int duracao = entradaFilme.nextInt();

			Filme movie = new Filme( nome, categoria, genero, duracao);
			System.out.println( movie );

		}
		if ( usua == 2) {
			Scanner coca = new Scanner (System.in);
			System.out.println(" Qual e o nome do livro?");
			String nome2 = coca.next();

			System.out.println(" Qual é a categoria");
			String cato = coca.next();

			System.out.println("Quem é autor do livro?");
			String autor = coca.next();

			System.out.println("Quantas paginas tem?");
			int paginas = coca.nextInt();

			Livro book = new Livro ( nome2, cato, autor, paginas) ;
			System.out.println(book);



		} 

		if ( usua == 3) {
			Scanner Scane = new Scanner(System.in);
			System.out.println("Qual é o nome da musica?");
			String musiq = Scane.next();

			System.out.println(" Qual é categoria?");
			String cate = Scane.next();

			System.out.println(" Qual é o cantor?");
			String cantor = Scane.next();

			System.out.println(" Qual é a banda?");
			String banda = Scane.next();

			System.out.println(" Qual é o genero?");
			String gene = Scane.next();

			Musica music = new Musica (musiq, cate, cantor, banda, gene);
			System.out.println(music);
		}
	}
}