package com.libreria.david.domain.user.service;

import com.libreria.david.domain.user.model.Book;

import java.util.List;

public interface BookUserService {
    List<Book> getAll();

    List<Book> getAll(int page, int size);

    int count();

    Book findByIsbn(String isbn);
}

