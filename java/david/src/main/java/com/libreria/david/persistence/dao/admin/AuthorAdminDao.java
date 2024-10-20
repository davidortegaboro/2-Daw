package com.libreria.david.persistence.dao.admin;

import com.libreria.david.domain.admin.model.Author;

import java.util.List;

public interface AuthorAdminDao {
    List<Author> getByIsbnBook(String isbn);
}
