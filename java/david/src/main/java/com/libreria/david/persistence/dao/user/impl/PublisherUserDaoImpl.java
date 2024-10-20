package com.libreria.david.persistence.dao.user.impl;

import com.libreria.david.domain.user.model.Publisher;
import com.libreria.david.persistence.dao.user.PublisherUserDao;
import com.libreria.david.persistence.dao.user.mapper.PublisherUserRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PublisherUserDaoImpl implements PublisherUserDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Publisher getByIsbnBook(String isbn) {
        String sql = """
                select * from publishers
                inner join books on publishers.id = books.id
                where books.isbn = ?;
                """;
        return jdbcTemplate.queryForObject(sql, new PublisherUserRowMapper());
    }
}
