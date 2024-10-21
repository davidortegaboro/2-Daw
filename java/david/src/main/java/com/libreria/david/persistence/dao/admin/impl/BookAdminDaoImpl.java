package com.libreria.david.persistence.dao.admin.impl;

import com.libreria.david.domain.admin.model.Book;
import com.libreria.david.persistence.dao.admin.BookAdminDao;
import com.libreria.david.persistence.dao.admin.mapper.BookAdminRowMapper;
import com.libreria.david.persistence.repository.admin.AuthorAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookAdminDaoImpl implements BookAdminDao {

    private final JdbcTemplate jdbcTemplate;
    private final AuthorAdminDaoImpl authorAdminDaoImpl;
    private final CategorieAdminDaoImpl categorieAdminDaoImpl;
    private final GenreAdminDaoImpl genreAdminDaoImpl;
    private final PublisherAdminDaoImpl publisherAdminDaoImpl;

    @Override
    public List<Book> getAll() {
        String sql = "select * from books";
        return jdbcTemplate.query(sql, new BookAdminRowMapper());
    }

    @Override
    public List<Book> getAll(int page, int size) {
        String sql = "select * from books LIMIT ? OFFSET ?";
        return jdbcTemplate.query(sql, new BookAdminRowMapper());
    }

    @Override
    public int count() {
        String sql = """
                        SELECT COUNT(*) FROM books
                     """;
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        String sql = "select * from books where isbn = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BookAdminRowMapper(), isbn);
        try{
            book.setAuthorList(authorAdminDaoImpl.getByIsbnBook(isbn));
            book.setCategorie(categorieAdminDaoImpl.getByIsbnBook(isbn));
            book.setGenreList(genreAdminDaoImpl.getByIsbnBook(isbn));
            book.setPublisher(publisherAdminDaoImpl.getByIsbnBook(isbn));

            return Optional.of(book);
        } catch (Exception e){
            return Optional.empty();
        }
    }
    }

