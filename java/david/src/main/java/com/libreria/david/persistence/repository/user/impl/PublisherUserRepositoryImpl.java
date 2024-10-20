package com.libreria.david.persistence.repository.user.impl;

import com.libreria.david.domain.user.model.Publisher;
import com.libreria.david.persistence.dao.user.PublisherUserDao;
import com.libreria.david.persistence.repository.user.PublisherUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PublisherUserRepositoryImpl implements PublisherUserRepository {

    private PublisherUserDao publisherUserDao;
    @Autowired
    public PublisherUserRepositoryImpl(PublisherUserDao publisherUserDao) {
        this.publisherUserDao = publisherUserDao;
    }

    @Override
    public Publisher getByIsbnBook(String isbn) {
        return publisherUserDao.getByIsbnBook(isbn);
    }
}
