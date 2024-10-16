package com.libreria.david.persistence.repositoryImpl;

import com.libreria.david.domain.model.Genre;
import com.libreria.david.domain.repository.GenreRepository;
import com.libreria.david.persistence.dao.GenreDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GenreRepositoryImpl implements GenreRepository {

    private GenreDao genreDao;
    @Autowired
    public GenreRepositoryImpl(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    @Override
    public List<Genre> getByIsbnBook(String isbn) {
        return genreDao.getByIsbnBook(isbn);
    }
}
