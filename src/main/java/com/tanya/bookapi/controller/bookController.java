package com.tanya.bookapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanya.bookapi.entities.Book;
import com.tanya.bookapi.service.BookServiceImpl;

@RestController
@RequestMapping("/api")
public class bookController {
	
	@Autowired
	private BookServiceImpl bookService;
	
	@GetMapping("/books")
	public List<Book> getBook() {
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
	}
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@PutMapping("/books/{id}")
	public Book updateBook(@PathVariable int id,@RequestBody Book book) {
		return bookService.updateBook(id,book);
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBookById(@PathVariable int id) {
		bookService.deleteBook(id);
	}
}
