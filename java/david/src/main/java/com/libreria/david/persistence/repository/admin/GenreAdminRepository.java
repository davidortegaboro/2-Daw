package com.libreria.david.persistence.repository.admin;

import com.libreria.david.domain.admin.model.Genre;

import java.util.List;

public interface GenreAdminRepository {
    List<Genre> getByIsbnBook(String isbn);
}
