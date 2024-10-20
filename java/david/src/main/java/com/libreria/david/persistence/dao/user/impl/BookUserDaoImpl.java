package com.libreria.david.persistence.dao.user.impl;

import com.libreria.david.domain.user.model.Book;
import com.libreria.david.persistence.dao.user.AuthorUserDao;
import com.libreria.david.persistence.dao.user.BookUserDao;
import com.libreria.david.persistence.dao.user.CategorieUserDao;
import com.libreria.david.persistence.dao.user.mapper.BookUserRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookUserDaoImpl implements BookUserDao {

    private final JdbcTemplate jdbcTemplate;
    private final AuthorUserDaoImpl authorUserDaoImpl;
    private final CategorieUserDaoImpl categorieUserDaoImpl;
    private final GenreUserDaoImlp genreUserDaoImlp;
    private final PublisherUserDaoImpl publisherUserDaoImpl;

    @Override
    public List<Book> getAll() {
        String sql = "select * from books";
        return jdbcTemplate.query(sql, new BookUserRowMapper());
    }

    @Override
    public List<Book> getAll(int page, int size) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        String sql = "select * from books where isbn = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BookUserRowMapper(), isbn);
        try{
            book.setAuthorList(authorUserDaoImpl.getByIsbnBook(isbn));
            book.setCategorie(categorieUserDaoImpl.getByIsbnBook(isbn));
            book.setGenreList(genreUserDaoImlp.getByIsbnBook(isbn));
            book.setPublisher(publisherUserDaoImpl.getByIsbnBook(isbn));

            return Optional.of(book);
        } catch (Exception e){
            return Optional.empty();
        }
    }
    }

