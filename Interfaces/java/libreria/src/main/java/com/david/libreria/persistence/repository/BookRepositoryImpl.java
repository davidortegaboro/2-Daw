package com.david.libreria.persistence.repository;

import com.david.libreria.domain.entity.Book;
import com.david.libreria.domain.repository.BookRepository;
import com.david.libreria.persistence.dao.BookDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class BookRepositoryImpl implements BookRepository {


    private BookDao bookDao;
    @Autowired
    public BookRepositoryImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return bookDao.findByIsbn(isbn);
    }
}
