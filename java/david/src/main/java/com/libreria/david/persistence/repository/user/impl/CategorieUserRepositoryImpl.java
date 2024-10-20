package com.libreria.david.persistence.repository.user.impl;

import com.libreria.david.domain.user.model.Categorie;
import com.libreria.david.persistence.dao.user.CategorieUserDao;
import com.libreria.david.persistence.repository.user.CategorieUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategorieUserRepositoryImpl implements CategorieUserRepository {
    private CategorieUserDao categorieUserDao;
    @Autowired
    public CategorieUserRepositoryImpl(CategorieUserDao categorieUserDao) {
        this.categorieUserDao = categorieUserDao;
    }

    @Override
    public Categorie getByIsbnBook(String isbn) {
        return categorieUserDao.getByIsbnBook(isbn);
    }
}
