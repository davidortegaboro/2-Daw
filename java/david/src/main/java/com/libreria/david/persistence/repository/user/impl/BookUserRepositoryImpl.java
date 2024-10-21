package com.libreria.david.persistence.repository.user.impl;

import com.libreria.david.domain.user.model.Book;
import com.libreria.david.persistence.dao.user.BookUserDao;
import com.libreria.david.persistence.repository.user.BookUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookUserRepositoryImpl implements BookUserRepository {

    private BookUserDao bookUserDao;
    @Autowired
    public BookUserRepositoryImpl(BookUserDao bookUserDao) {
        this.bookUserDao = bookUserDao;
    }

    @Override
    public List<Book> getAll() {
        return bookUserDao.getAll();
    }

    @Override
    public List<Book> getAll(int page, int size) {
        return bookUserDao.getAll(page, size);
    }

    @Override
    public int count() {
        return bookUserDao.count();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return bookUserDao.findByIsbn(isbn);
    }
}
