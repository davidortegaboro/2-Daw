package com.libreria.david.persistence.dao.admin.mapper;


import com.libreria.david.domain.admin.model.Publisher;
import com.mysql.cj.result.Row;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PublisherAdminRowMapper implements RowMapper<Publisher> {
    @Override
    public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
        Publisher publisher = new Publisher();
        publisher.setId(rs.getInt("id"));
        publisher.setName(rs.getString("name"));
        publisher.setSlug(rs.getNString("slug"));
        return publisher;
    }
}
