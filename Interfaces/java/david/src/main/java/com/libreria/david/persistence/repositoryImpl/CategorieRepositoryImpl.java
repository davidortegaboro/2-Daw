package com.libreria.david.persistence.repositoryImpl;

import com.libreria.david.domain.model.Categorie;
import com.libreria.david.domain.repository.CategorieRepository;
import com.libreria.david.persistence.dao.CategorieDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategorieRepositoryImpl implements CategorieRepository {

    private CategorieDao categorieDao;
    @Autowired
    public CategorieRepositoryImpl(CategorieDao categorieDao) {
        this.categorieDao = categorieDao;
    }

    @Override
    public Categorie getByIsbnBook(String isbn) {
        return categorieDao.getByIsbnBook(isbn);
    }
}
