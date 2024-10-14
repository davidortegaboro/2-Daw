package com.libreria.david.persistence.repositoryImpl;

import com.libreria.david.domain.model.Author;
import com.libreria.david.domain.repository.AuthorRepository;
import com.libreria.david.persistence.dao.AuthorDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {

    private AuthorDao authorDao;

    @Autowired
    public AuthorRepositoryImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public List<Author> getByIsbnBook(String isbn) {
        return authorDao.getByIsbnBook(isbn);
    }
}
