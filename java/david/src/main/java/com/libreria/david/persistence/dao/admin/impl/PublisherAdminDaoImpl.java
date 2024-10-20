package com.libreria.david.persistence.dao.admin.impl;

import com.libreria.david.domain.admin.model.Publisher;
import com.libreria.david.persistence.dao.admin.PublisherAdminDao;
import com.libreria.david.persistence.dao.admin.mapper.PublisherAdminRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PublisherAdminDaoImpl implements PublisherAdminDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Publisher getByIsbnBook(String isbn) {
        String sql = """
                select * from publishers
                inner join books on publishers.id = books.id
                where books.isbn = ?;
                """;
        return jdbcTemplate.queryForObject(sql, new PublisherAdminRowMapper());
    }
}
