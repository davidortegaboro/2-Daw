package com.libreria.david.persistence.dao.user;

import com.libreria.david.domain.user.model.Genre;

import java.util.List;

public interface GenreUserDao {
    List<Genre> getByIsbnBook(String isbn);
}
