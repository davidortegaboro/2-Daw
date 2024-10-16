package com.libreria.david.persistence.dao;

import com.libreria.david.domain.model.Categorie;

public interface CategorieDao {

    Categorie getByIsbnBook(String isbn);
}
