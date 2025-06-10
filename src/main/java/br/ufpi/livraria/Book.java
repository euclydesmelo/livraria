package br.ufpi.livraria;

public class Book {
	
	private String titulo;
	private Double valor;
	private String isbn;

	public Book(String titulo, double valor, String isbn) {
		this.titulo = titulo;
		this.valor = valor;
		this.isbn = isbn;
	}

	public Double getValor() {
		return valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIsbn() {
		return isbn;
	}

}
