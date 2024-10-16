package com.david.libreria.persistence.dao;

import com.david.libreria.domain.entity.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {

    List<Author> getByIsbnBook(String isbn);

}
