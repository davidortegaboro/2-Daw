package com.libreria.david.persistence.dao.impl;

import com.libreria.david.domain.model.Book;
import com.libreria.david.domain.repository.AuthorRepository;
import com.libreria.david.domain.repository.CategorieRepository;
import com.libreria.david.domain.repository.GenreRepository;
import com.libreria.david.domain.repository.PublisherRepository;
import com.libreria.david.persistence.dao.BookDao;
import com.libreria.david.persistence.dao.mapper.BookRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;
    private final AuthorRepository authorRepository;
    private final CategorieRepository categorieRepository;
    private final GenreRepository genreRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public List<Book> findAll() {

        String sql = "select * from books";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    @Override
    public Optional<Book> findByIbn(String isbn) {

        String sql = "select * from books where isbn = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), isbn);
        try{
            book.setAuthorList(authorRepository.getByIsbnBook(isbn));
            book.setCategorie(categorieRepository.getByIsbnBook(isbn));
            book.setGenreList(genreRepository.getByIsbnBook(isbn));
            book.setPublisher(publisherRepository.getByIsbnBook(isbn));

            return Optional.of(book);
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
