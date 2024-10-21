package com.libreria.david.domain.admin.service.impl;

import com.libreria.david.common.exception.ResourceNotFoundException;
import com.libreria.david.domain.admin.model.Book;
import com.libreria.david.domain.admin.service.BookAdminService;
import com.libreria.david.persistence.repository.admin.BookAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookAdminServiceImpl implements BookAdminService {


    private BookAdminRepository bookAdminRepository;

    @Autowired
    public BookAdminServiceImpl(BookAdminRepository bookAdminRepository) {
        this.bookAdminRepository = bookAdminRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookAdminRepository.getAll();
    }

    @Override
    public List<Book> getAll(int page, int size) {
        return bookAdminRepository.getAll(page, size);
    }

    @Override
    public int count() {
        return bookAdminRepository.count();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookAdminRepository.findByIsbn(isbn).orElseThrow(() -> new ResourceNotFoundException("No se ha encontrado"));
    }
}
