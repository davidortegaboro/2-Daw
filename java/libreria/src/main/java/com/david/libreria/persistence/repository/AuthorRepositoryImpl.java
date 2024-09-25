package com.david.libreria.persistence.repository;

import com.david.libreria.domain.repository.AuthorRepository;
import com.david.libreria.persistence.dao.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

    private AuthorDao authorDao;
    @Autowired
    public AuthorRepositoryImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }
}
