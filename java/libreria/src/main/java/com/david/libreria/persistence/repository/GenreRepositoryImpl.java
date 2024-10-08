package com.david.libreria.persistence.repository;

import com.david.libreria.domain.entity.Genre;
import com.david.libreria.domain.repository.GenreRepository;
import com.david.libreria.persistence.dao.GenreDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenreRepositoryImpl implements GenreRepository {

    private GenreDao genreDao;
    @Autowired
    public GenreRepositoryImpl(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    @Override
    public List<Genre> getByIsbnBook(String isbn) {
        return List.of();
    }
}
