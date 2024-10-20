package com.libreria.david.persistence.dao.user.impl;

import com.libreria.david.domain.user.model.Categorie;
import com.libreria.david.persistence.dao.user.CategorieUserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategorieUserDaoImpl implements CategorieUserDao {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public Categorie getByIsbnBook(String isbn) {
        String sql = """
                SELECT * FROM categories
                inner join books on categories.id = books.category_id
                where books.isbn = ?;
                """;
        return jdbcTemplate.queryForObject(sql, new CategorieUserRowMapper());
    }
}
