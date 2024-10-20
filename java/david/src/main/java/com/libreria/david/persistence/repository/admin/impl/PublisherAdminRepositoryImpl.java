package com.libreria.david.persistence.repository.admin.impl;

import com.libreria.david.domain.admin.model.Publisher;
import com.libreria.david.persistence.dao.admin.PublisherAdminDao;
import com.libreria.david.persistence.repository.admin.PublisherAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PublisherAdminRepositoryImpl implements PublisherAdminRepository {

    private PublisherAdminDao publisherAdminDao;
    @Autowired
    public PublisherAdminRepositoryImpl(PublisherAdminDao publisherAdminDao) {
        this.publisherAdminDao = publisherAdminDao;
    }

    @Override
    public Publisher getByIsbnBook(String isbn) {
        return publisherAdminDao.getByIsbnBook(isbn);
    }
}
