package com.libreria.david.persistence.repository.admin;

import com.libreria.david.domain.admin.model.Categorie;

public interface CategorieAdminRepository {
    Categorie getByIsbnBook(String isbn);
}
