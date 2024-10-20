package com.libreria.david.persistence.repository.user;

import com.libreria.david.domain.user.model.Author;

import java.util.List;

public interface AuthorUserRepository {
    List<Author> getByIsbnBook(String isbn);
}
