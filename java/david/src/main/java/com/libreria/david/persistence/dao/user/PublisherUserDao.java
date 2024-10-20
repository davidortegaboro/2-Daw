package com.libreria.david.persistence.dao.user;

import com.libreria.david.domain.user.model.Publisher;

public interface PublisherUserDao {
    Publisher getByIsbnBook(String isbn);
}
