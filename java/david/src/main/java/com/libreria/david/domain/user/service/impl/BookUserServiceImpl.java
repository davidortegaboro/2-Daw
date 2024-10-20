package com.libreria.david.domain.user.service.impl;

import com.libreria.david.common.exception.ResourceNotFoundException;
import com.libreria.david.domain.user.model.Book;
import com.libreria.david.domain.user.service.BookUserService;
import com.libreria.david.persistence.repository.user.BookUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookUserServiceImpl implements BookUserService {

    private BookUserRepository bookUserRepository;
    @Autowired
    public BookUserServiceImpl(BookUserRepository bookUserRepository) {
        this.bookUserRepository = bookUserRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookUserRepository.getAll();
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
    public Book findByIsbn(String isbn) {
        return bookUserRepository.findByIsbn(isbn).orElseThrow(() -> new ResourceNotFoundException("No se ha encontrado"));
    }
}
