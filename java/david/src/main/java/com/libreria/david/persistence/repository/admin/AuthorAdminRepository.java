package com.libreria.david.persistence.repository.admin;

import com.libreria.david.domain.admin.model.Author;

import java.util.List;

public interface AuthorAdminRepository {

    List<Author> getByIsbnBook(String isbn);
}
