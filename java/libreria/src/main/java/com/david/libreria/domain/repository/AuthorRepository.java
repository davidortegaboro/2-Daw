package com.david.libreria.domain.repository;

import com.david.libreria.domain.entity.Author;

import java.util.List;

public interface AuthorRepository {

    List<Author> getByIsbnBook(String isbn);
}
