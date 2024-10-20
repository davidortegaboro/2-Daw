package com.libreria.david.persistence.dao.user;

import com.libreria.david.domain.user.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookUserDao {
    List<Book> getAll();

    List<Book> getAll(int page, int size);

    int count();

    Optional<Book> findByIsbn(String isbn);
}
