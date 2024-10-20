package com.libreria.david.persistence.dao.user;

import com.libreria.david.domain.user.model.Author;

import java.util.List;

public interface AuthorUserDao {
    List<Author> getByIsbnBook(String isbn);
}
