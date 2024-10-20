package com.libreria.david.persistence.repository.user;

import com.libreria.david.domain.user.model.Publisher;

public interface PublisherUserRepository {
    Publisher getByIsbnBook(String isbn);
}
