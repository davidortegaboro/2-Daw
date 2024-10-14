package com.libreria.david.persistence.dao.impl;

import com.libreria.david.domain.model.Publisher;
import com.libreria.david.persistence.dao.PublisherDao;
import com.libreria.david.persistence.dao.mapper.PublisherRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PublisherDaoImpl implements PublisherDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Publisher getByIsbnBook(String isbn) {

        String sql = """
                select * from publishers
                inner join books on publishers.id = books.id
                where books.isbn = ?;
                """;
        return jdbcTemplate.queryForObject(sql, new PublisherRowMapper());
    }
}
