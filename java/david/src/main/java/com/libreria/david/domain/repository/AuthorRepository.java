package com.libreria.david.domain.repository;

import com.libreria.david.domain.model.Author;

import java.util.List;

public interface AuthorRepository {
    List<Author> getByIsbnBook(String isbn);
}
