package com.libreria.david.persistence.repositoryImpl;

import com.libreria.david.domain.model.Publisher;
import com.libreria.david.domain.repository.PublisherRepository;
import com.libreria.david.persistence.dao.PublisherDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PublisherRepositoryImpl implements PublisherRepository {

    private PublisherDao publisherDao;

    @Autowired
    public PublisherRepositoryImpl(PublisherDao publisherDao) {
        this.publisherDao = publisherDao;
    }

    @Override
    public Publisher getByIsbnBook(String isbn) {
        return publisherDao.getByIsbnBook(isbn);
    }
}
