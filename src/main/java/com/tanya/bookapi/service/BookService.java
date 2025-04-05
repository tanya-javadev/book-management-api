package com.tanya.bookapi.service;

import java.util.List;

import com.tanya.bookapi.entities.Book;

public interface BookService {

	List<Book> getAllBooks();
	Book getBookById(int id);
	Book createBook(Book book);
	Book updateBook(int id,Book book);
	void deleteBook(int id);
}
