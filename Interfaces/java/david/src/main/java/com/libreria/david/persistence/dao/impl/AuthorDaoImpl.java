package com.libreria.david.persistence.dao.impl;

import com.libreria.david.domain.model.Author;
import com.libreria.david.persistence.dao.AuthorDao;
import com.libreria.david.persistence.dao.mapper.AuthorRowMapper;
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
                select * from authors
                inner join books_authors on books_authors.author_id = authors.id
                inner join books on books_authors.book_id = books.id
                where books.isbn = ?;
                """;

        return jdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }
}
