package com.libreria.david.persistence.dao;

import com.libreria.david.domain.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {

    List<Book> findAll();
    Optional<Book> findByIbn(String isbn);
}
