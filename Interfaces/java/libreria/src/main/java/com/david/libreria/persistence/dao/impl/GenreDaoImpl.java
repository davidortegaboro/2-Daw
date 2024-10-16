package com.david.libreria.persistence.dao.impl;

import com.david.libreria.domain.entity.Genre;
import com.david.libreria.persistence.dao.GenreDao;
import com.david.libreria.persistence.dao.mapper.GenreRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GenreDaoImpl implements GenreDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Genre> getByIsbnBook(String isbn) {

        String sql = """
                SELECT genres.* FROM genres
                JOIN books_genres ON genres.id = books_genres.genre_id
                JOIN books ON books_genres.book_id = books.id
                AND books.isbn = ?
    """;

        return jdbcTemplate.query(sql, new GenreRowMapper(), isbn);
    }
}
