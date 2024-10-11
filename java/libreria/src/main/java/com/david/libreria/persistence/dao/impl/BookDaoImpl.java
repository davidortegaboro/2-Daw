package com.david.libreria.persistence.dao.impl;

import com.david.libreria.domain.entity.Book;
import com.david.libreria.persistence.dao.AuthorDao;
import com.david.libreria.persistence.dao.BookDao;
import com.david.libreria.persistence.dao.GenreDao;
import com.david.libreria.persistence.dao.mapper.BookRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorDao authorDao;
    private final GenreDao genreDao;

    @Override
    public List<Book> getAll() {

        String sql = "select * from books";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {

        String sql = """
                SELECT * FROM books
                 LEFT JOIN categories ON books.category_id = categories.id
                 LEFT JOIN publishers ON books.publisher_id = publishers.id
                 WHERE books.isbn = ?
           """;
        try {
            Book book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), isbn);
            book.setAuthors(authorDao.getByIsbnBook(isbn));
            book.setGenres(genreDao.getByIsbnBook(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
