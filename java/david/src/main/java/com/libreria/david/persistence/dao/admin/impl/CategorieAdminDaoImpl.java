package com.libreria.david.persistence.dao.admin.impl;

import com.libreria.david.domain.admin.model.Categorie;
import com.libreria.david.persistence.dao.admin.CategorieAdminDao;
import com.libreria.david.persistence.dao.admin.mapper.CategorieAdminRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategorieAdminDaoImpl implements CategorieAdminDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Categorie getByIsbnBook(String isbn) {
        String sql = """
                SELECT * FROM categories
                inner join books on categories.id = books.category_id
                where books.isbn = ?;
                """;
        return jdbcTemplate.queryForObject(sql, new CategorieAdminRowMapper());
    }
}
