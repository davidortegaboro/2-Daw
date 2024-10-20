package com.libreria.david.persistence.repository.admin;

import com.libreria.david.domain.admin.model.Publisher;

public interface PublisherAdminRepository {
    Publisher getByIsbnBook(String isbn);
}
