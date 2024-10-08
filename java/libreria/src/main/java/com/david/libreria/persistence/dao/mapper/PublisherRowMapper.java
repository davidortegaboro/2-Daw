package com.david.libreria.persistence.dao.mapper;

import com.david.libreria.domain.entity.Category;
import com.david.libreria.domain.entity.Publisher;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PublisherRowMapper implements RowMapper<Publisher> {
    @Override
    public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
        Publisher publisher = new Publisher();

        publisher.setId(rs.getInt("id"));
        publisher.setName(rs.getNString("name"));
        publisher.setSlug(rs.getNString("slug"));

        return publisher;
    }
}
