package com.libreria.david.domain.repository;

import com.libreria.david.domain.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    List<Book> findAll();
    Optional<Book> findByIbn(String isbn);

}
