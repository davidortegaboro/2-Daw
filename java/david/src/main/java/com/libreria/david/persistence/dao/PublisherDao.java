package com.libreria.david.persistence.dao;

import com.libreria.david.domain.model.Publisher;

public interface PublisherDao {

    Publisher getByIsbnBook(String isbn);
}
