package com.david.libreria.persistence.repository;

import com.david.libreria.domain.repository.PublisherRepository;
import com.david.libreria.persistence.dao.PublisherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PublisherRepositoryImpl implements PublisherRepository {

    private PublisherDao publisherDao;
    @Autowired
    public PublisherRepositoryImpl(PublisherDao publisherDao) {
        this.publisherDao = publisherDao;
    }
}
