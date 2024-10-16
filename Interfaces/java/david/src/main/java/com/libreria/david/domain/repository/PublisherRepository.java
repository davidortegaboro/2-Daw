package com.libreria.david.domain.repository;

import com.libreria.david.domain.model.Publisher;

public interface PublisherRepository {

    Publisher getByIsbnBook(String isbn);
}
