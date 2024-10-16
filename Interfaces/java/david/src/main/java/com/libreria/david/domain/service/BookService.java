package com.libreria.david.domain.service;

import com.libreria.david.domain.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
    Book findByIsbn(String isbn);
}
