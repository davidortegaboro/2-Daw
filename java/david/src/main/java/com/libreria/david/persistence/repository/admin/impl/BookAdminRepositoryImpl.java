package com.libreria.david.persistence.repository.admin.impl;

import com.libreria.david.domain.admin.model.Book;
import com.libreria.david.persistence.dao.admin.BookAdminDao;
import com.libreria.david.persistence.repository.admin.BookAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookAdminRepositoryImpl implements BookAdminRepository {

    private BookAdminDao bookAdminDao;

    @Autowired
    public BookAdminRepositoryImpl(BookAdminDao bookAdminDao) {
        this.bookAdminDao = bookAdminDao;
    }

    @Override
    public List<Book> getAll() {
        return bookAdminDao.getAll();
    }

    @Override
    public List<Book> getAll(int page, int size) {
        return bookAdminDao.getAll(page, size);
    }

    @Override
    public int count() {
        return bookAdminDao.count();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return bookAdminDao.findByIsbn(isbn);
    }
}
