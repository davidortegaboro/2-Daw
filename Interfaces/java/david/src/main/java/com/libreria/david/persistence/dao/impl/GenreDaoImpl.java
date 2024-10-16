package com.libreria.david.persistence.dao.impl;

import com.libreria.david.domain.model.Genre;
import com.libreria.david.persistence.dao.GenreDao;
import com.libreria.david.persistence.dao.mapper.GenreRowMapper;
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
                select * from genres
                inner join books_genres on genres.id = books_genres.genre_id
                inner join books on books_genres.book_id = books.id
                where books.isbn = ?;
                """;
        return jdbcTemplate.query(sql, new GenreRowMapper(), isbn);
    }
}
