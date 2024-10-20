package com.libreria.david.persistence.dao.admin.mapper;

import com.libreria.david.domain.admin.model.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorAdminRowMapper implements RowMapper<Author> {
    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {

        Author author = new Author();
        author.setId(rs.getInt("id"));
        author.setName(rs.getString("name"));
        author.setBiographyEs(rs.getNString("biography_es"));
        author.setBirthYear(rs.getInt("birth_year"));
        author.setBirthDeath(rs.getInt("death_year"));
        return author;
    }
}
