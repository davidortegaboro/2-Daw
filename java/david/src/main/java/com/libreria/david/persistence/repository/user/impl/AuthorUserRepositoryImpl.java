package com.libreria.david.persistence.repository.user.impl;

import com.libreria.david.domain.user.model.Author;
import com.libreria.david.persistence.dao.user.AuthorUserDao;
import com.libreria.david.persistence.repository.user.AuthorUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorUserRepositoryImpl implements AuthorUserRepository {

    private AuthorUserDao authorUserDao;
    @Autowired
    public AuthorUserRepositoryImpl(AuthorUserDao authorUserDao) {
        this.authorUserDao = authorUserDao;
    }

    @Override
    public List<Author> getByIsbnBook(String isbn) {
        return authorUserDao.getByIsbnBook(isbn);
    }
}
