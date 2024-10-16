package com.david.libreria.domain.repository;

import com.david.libreria.domain.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);
}
