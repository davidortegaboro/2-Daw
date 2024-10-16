package com.libreria.david.persistence.dao.impl;

import com.libreria.david.domain.model.Categorie;
import com.libreria.david.persistence.dao.CategorieDao;
import com.libreria.david.persistence.dao.mapper.CategorieRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategorieDaoImpl implements CategorieDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Categorie getByIsbnBook(String isbn) {

        String sql = """
                SELECT * FROM categories
                inner join books on categories.id = books.category_id
                where books.isbn = ?;
                """;
        return jdbcTemplate.queryForObject(sql, new CategorieRowMapper());
    }
}
