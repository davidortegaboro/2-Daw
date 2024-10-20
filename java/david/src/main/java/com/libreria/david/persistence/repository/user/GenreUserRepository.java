package com.libreria.david.persistence.repository.user;

import com.libreria.david.domain.user.model.Genre;

import java.util.List;

public interface GenreUserRepository {
    List<Genre> getByIsbnBook(String isbn);
}
