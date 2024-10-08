package com.david.libreria.persistence.dao.mapper;

import com.david.libreria.domain.entity.Author;
import org.springframework.jdbc.core.RowMapper;


import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper implements RowMapper<Author>{

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getInt("id"));
        author.setName(rs.getNString("name"));
        author.setNationality(rs.getNString("nationality"));
        author.setBiography(rs.getNString("biography_es"));
        author.setBirthYear (rs.getInt("birth_year"));
        author.setBirthYear(rs.getInt("birth_death"));

        return author;
    }
}
