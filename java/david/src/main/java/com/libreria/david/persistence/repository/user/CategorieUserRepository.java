package com.libreria.david.persistence.repository.user;

import com.libreria.david.domain.user.model.Categorie;

public interface CategorieUserRepository {
    Categorie getByIsbnBook(String isbn);
}
