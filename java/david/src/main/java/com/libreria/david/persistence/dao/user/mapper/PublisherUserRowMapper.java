package com.libreria.david.persistence.dao.user.mapper;

import com.libreria.david.domain.user.model.Publisher;
import com.mysql.cj.result.Row;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PublisherUserRowMapper implements RowMapper<Publisher> {
    @Override
    public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
        Publisher publisher = new Publisher();
        publisher.setName(rs.getString("name"));
        publisher.setSlug(rs.getNString("slug"));
        return publisher;
    }
}
