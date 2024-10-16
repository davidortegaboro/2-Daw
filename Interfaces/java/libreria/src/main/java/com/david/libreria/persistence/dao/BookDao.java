package com.david.libreria.persistence.dao;

import com.david.libreria.domain.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {

    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);
}
