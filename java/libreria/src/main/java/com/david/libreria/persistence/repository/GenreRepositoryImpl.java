package com.david.libreria.persistence.repository;

import com.david.libreria.domain.entity.Genre;
import com.david.libreria.domain.repository.GenreRepository;
import com.david.libreria.persistence.dao.GenreDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
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
