package com.david.libreria.persistence.dao.mapper;

import com.david.libreria.domain.entity.Category;
import com.david.libreria.domain.entity.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreRowMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        Genre genre = new Genre();

        genre.setId(rs.getInt("id"));
        genre.setName(rs.getNString("name_es"));
        genre.setSlug(rs.getNString("slug"));

        return genre;
    }
}
