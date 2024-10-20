package com.libreria.david.persistence.repository.user.impl;

import com.libreria.david.domain.user.model.Genre;
import com.libreria.david.persistence.dao.user.GenreUserDao;
import com.libreria.david.persistence.repository.user.GenreUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GenreUserRepositoryImpl implements GenreUserRepository {

    private GenreUserDao genreUserDao;
    @Autowired
    public GenreUserRepositoryImpl(GenreUserDao genreUserDao) {
        this.genreUserDao = genreUserDao;
    }

    @Override
    public List<Genre> getByIsbnBook(String isbn) {
        return genreUserDao.getByIsbnBook(isbn);
    }
}
