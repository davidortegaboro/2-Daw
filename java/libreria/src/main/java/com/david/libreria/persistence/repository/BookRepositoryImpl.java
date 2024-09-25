package com.david.libreria.persistence.repository;

import com.david.libreria.domain.repository.BookRepository;
import com.david.libreria.persistence.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class BookRepositoryImpl implements BookRepository {


    private BookDao bookDao;
    @Autowired
    public BookRepositoryImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
