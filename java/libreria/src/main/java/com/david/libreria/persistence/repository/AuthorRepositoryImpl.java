package com.david.libreria.persistence.repository;

import com.david.libreria.domain.entity.Author;
import com.david.libreria.domain.repository.AuthorRepository;
import com.david.libreria.persistence.dao.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

    private AuthorDao authorDao;
    @Autowired
    public AuthorRepositoryImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public List<Author> getByIsbnBook(String isbn) {
        return List.of();
    }
}
