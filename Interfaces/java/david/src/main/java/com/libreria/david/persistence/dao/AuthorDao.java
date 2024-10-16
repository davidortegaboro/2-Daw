package com.libreria.david.persistence.dao;

import com.libreria.david.domain.model.Author;

import java.util.List;

public interface AuthorDao {

    List<Author> getByIsbnBook(String isbn);
}
