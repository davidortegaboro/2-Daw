package com.libreria.david.persistence.dao.admin;

import com.libreria.david.domain.admin.model.Publisher;

public interface PublisherAdminDao {
    Publisher getByIsbnBook(String isbn);
}
