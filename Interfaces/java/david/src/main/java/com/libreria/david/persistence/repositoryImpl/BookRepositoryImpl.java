package com.libreria.david.persistence.repositoryImpl;

import com.libreria.david.domain.model.Book;
import com.libreria.david.domain.repository.BookRepository;
import com.libreria.david.persistence.dao.BookDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private BookDao bookDao;

    @Autowired
    public BookRepositoryImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Optional<Book> findByIbn(String isbn) {
        return bookDao.findByIbn(isbn);
    }
}
