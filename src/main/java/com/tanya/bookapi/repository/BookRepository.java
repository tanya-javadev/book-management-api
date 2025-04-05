package com.tanya.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanya.bookapi.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
