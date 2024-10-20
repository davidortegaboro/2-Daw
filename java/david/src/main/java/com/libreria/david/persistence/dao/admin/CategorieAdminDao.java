package com.libreria.david.persistence.dao.admin;

import com.libreria.david.domain.admin.model.Categorie;

public interface CategorieAdminDao {
    Categorie getByIsbnBook(String isbn);
}
