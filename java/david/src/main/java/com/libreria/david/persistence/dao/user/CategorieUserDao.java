package com.libreria.david.persistence.dao.user;

import com.libreria.david.domain.user.model.Categorie;

public interface CategorieUserDao {
    Categorie getByIsbnBook(String isbn);
}
