package br.ufpi.livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShoppingCart {

	public static final String MSG_VALOR_VALIDO = "O valor tem que ser maior que zero.";
	private Double total = 0.0;
	private List<Book> items = new ArrayList<>();

	public void add(Book book) {
		if (book.getValor() <= 0)
			throw new IllegalArgumentException(MSG_VALOR_VALIDO);
			
		items.add(book);
		total += book.getValor();
	}

	public Double getTotal() {
		return total;
	}

	public void remove(Book book) {
		items.remove(book);
		total -= book.getValor();
	}

}
