package com.tanya.bookapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanya.bookapi.entities.Book;
import com.tanya.bookapi.exceptions.BookNotFoundException;
import com.tanya.bookapi.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(int id) {
		return bookRepository.findById(id).orElseThrow(()->new BookNotFoundException("Book not found !"+id));
	}

	public Book createBook(Book book) {
		return bookRepository.save(book);
	}

	public Book updateBook(int id, Book book) {
		Book bookDetails= getBookById(id);
		bookDetails.setAuthor(book.getAuthor());
		bookDetails.setTitle(book.getTitle());
		bookDetails.setYear(book.getYear());
		return bookRepository.save(bookDetails);
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}


}
