package br.ufpi.livraria.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpi.livraria.Book;
import br.ufpi.livraria.ShoppingCart;

@RestController
@RequestMapping("/api/v1")
public class ShoppingCartController {
	
	@Autowired
	private ShoppingCart cart;

	@GetMapping
	public String total() {
		return "Total: " + cart.getTotal();
	}
	
	@PostMapping
	public String add(@RequestBody Book book) {
		cart.add(book);
		return "Total: " + cart.getTotal();
	}
	
	@DeleteMapping
	public String del(String isbn) {
		cart.remove(new Book(isbn));
		return "Total: " + cart.getTotal();
	}

}
