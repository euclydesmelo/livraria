package br.ufpi.livraria;

import java.util.Objects;

public class Book {
	
	private String titulo;
	private Double valor;
	private String isbn;

	public Book(String titulo, double valor, String isbn) {
		this.titulo = titulo;
		this.valor = valor;
		this.isbn = isbn;
	}

	public Book(String isbn) {
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

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

}
