package com.david.libreria.domain.repository;

import com.david.libreria.domain.entity.Genre;

import java.util.List;

public interface GenreRepository {

    List<Genre> getByIsbnBook(String isbn);
}
