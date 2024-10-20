package com.libreria.david.persistence.repository.admin.impl;

import com.libreria.david.domain.admin.model.Author;
import com.libreria.david.persistence.dao.admin.AuthorAdminDao;
import com.libreria.david.persistence.repository.admin.AuthorAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorAdminRepositoryImpl implements AuthorAdminRepository {

    private AuthorAdminDao authorAdminDao;

    @Autowired
    public AuthorAdminRepositoryImpl(AuthorAdminDao authorAdminDao) {
        this.authorAdminDao = authorAdminDao;
    }

    @Override
     public List<Author> getByIsbnBook(String isbn) {
        return authorAdminDao.getByIsbnBook(isbn);
    }
}
