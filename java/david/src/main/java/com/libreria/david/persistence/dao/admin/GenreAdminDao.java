package com.libreria.david.persistence.dao.admin;

import com.libreria.david.domain.admin.model.Genre;

import java.util.List;

public interface GenreAdminDao {
    List<Genre> getByIsbnBook(String isbn);
}
