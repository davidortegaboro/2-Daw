package com.libreria.david.persistence.dao.admin;

import com.libreria.david.domain.admin.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookAdminDao {
    List<Book> getAll();

    List<Book> getAll(int page, int size);

    int count();

    Optional<Book> findByIsbn(String isbn);
}
