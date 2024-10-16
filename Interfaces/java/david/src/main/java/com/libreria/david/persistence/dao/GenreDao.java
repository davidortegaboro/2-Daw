package com.libreria.david.persistence.dao;

import com.libreria.david.domain.model.Genre;

import java.util.List;

public interface GenreDao {

    List<Genre> getByIsbnBook(String isbn);
}
