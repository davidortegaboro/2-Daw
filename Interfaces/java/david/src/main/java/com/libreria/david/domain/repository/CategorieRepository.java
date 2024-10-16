package com.libreria.david.domain.repository;

import com.libreria.david.domain.model.Categorie;

public interface CategorieRepository {

    Categorie getByIsbnBook(String isbn);
}
