package com.david.libreria.domain.service;

import com.david.libreria.domain.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book findByIsb(String isbn);
}
