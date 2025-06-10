package br.ufpi.livraria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
	
	@Test
	public void testAddEndGetTotal() {
		Book book1 = new Book("Book 1", 10.0, "1");
		Book book2 = new Book("Book 2", 15.0, "2");
		Book book3 = new Book("Book 3", -15.0, "3");
		
		ShoppingCart cart = new ShoppingCart();
		cart.add(book1);
		cart.add(book2);
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			cart.add(book3);
		});
		
		assertTrue(ShoppingCart.MSG_VALOR_VALIDO.equals(exception.getMessage()));
		assertEquals(25.0, cart.getTotal());
	}
	
	@Test
	public void testRemove() {
		Book book1 = new Book("Book 1", 10.0, "1");
		Book book2 = new Book("Book 2", 15.0, "2");
		Book book3 = new Book("Book 3", 5.0, "3");
		
		ShoppingCart cart = new ShoppingCart();
		cart.add(book1);
		cart.add(book2);
		cart.add(book3);
		
		cart.remove(book1);
		
		assertEquals(25.0, cart.getTotal());
	}

}
