package com.libreria.david.persistence.repository.admin.impl;

import com.libreria.david.domain.admin.model.Genre;
import com.libreria.david.persistence.dao.admin.GenreAdminDao;
import com.libreria.david.persistence.repository.admin.GenreAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GenreAdminRepositoryImpl implements GenreAdminRepository {

    private GenreAdminDao genreAdminDao;
    @Autowired
    public GenreAdminRepositoryImpl(GenreAdminDao genreAdminDao) {
        this.genreAdminDao = genreAdminDao;
    }

    @Override
    public List<Genre> getByIsbnBook(String isbn) {
        return genreAdminDao.getByIsbnBook(isbn);
    }
}
