package com.david.libreria.persistence.dao;

import com.david.libreria.domain.entity.Genre;

import java.util.List;

public interface GenreDao {

    List<Genre> getByIsbnBook(String isbn);
}
