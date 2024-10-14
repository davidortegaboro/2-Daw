package com.libreria.david.domain.repository;

import com.libreria.david.domain.model.Genre;

import java.util.List;

public interface GenreRepository {

    List<Genre> getByIsbnBook(String isbn);
}
