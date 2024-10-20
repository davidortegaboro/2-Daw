package com.libreria.david.persistence.repository.admin.impl;

import com.libreria.david.domain.admin.model.Categorie;
import com.libreria.david.persistence.dao.admin.CategorieAdminDao;
import com.libreria.david.persistence.repository.admin.CategorieAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategorieAdminRepositoryImpl implements CategorieAdminRepository {

    private CategorieAdminDao categorieAdminDao;
    @Autowired
    public CategorieAdminRepositoryImpl(CategorieAdminDao categorieAdminDao) {
        this.categorieAdminDao = categorieAdminDao;
    }

    @Override
    public Categorie getByIsbnBook(String isbn) {
        return categorieAdminDao.getByIsbnBook(isbn);
    }
}
