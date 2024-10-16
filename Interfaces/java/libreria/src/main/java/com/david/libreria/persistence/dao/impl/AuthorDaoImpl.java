package com.david.libreria.persistence.dao.impl;

import com.david.libreria.domain.entity.Author;
import com.david.libreria.persistence.dao.AuthorDao;
import com.david.libreria.persistence.dao.mapper.AuthorRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorDaoImpl implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Author> getByIsbnBook(String isbn) {
        String sql = """
            SELECT authors.* FROM authors
            JOIN books_authors ON authors.id = books_authors.author_id
            JOIN books ON books_authors.book_id = books.id
            AND books.isbn = ?
        """;

        return jdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }
}
