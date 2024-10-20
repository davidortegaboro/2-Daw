package com.libreria.david.persistence.dao.admin.impl;

import com.libreria.david.domain.admin.model.Author;
import com.libreria.david.persistence.dao.admin.AuthorAdminDao;
import com.libreria.david.persistence.dao.admin.mapper.AuthorAdminRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorAdminDaoImpl implements AuthorAdminDao {

    private final JdbcTemplate jdbcTemplate;
    @Override
    public List<Author> getByIsbnBook(String isbn) {
        String sql = """
                select * from authors
                inner join books_authors on books_authors.author_id = authors.id
                inner join books on books_authors.book_id = books.id
                where books.isbn = ?;
                """;

        return jdbcTemplate.query(sql, new AuthorAdminRowMapper(), isbn);
    }
}
