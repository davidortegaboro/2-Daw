package com.libreria.david.persistence.dao.admin.mapper;


import com.libreria.david.domain.admin.model.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreAdminRowMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        Genre genre = new Genre();
        genre.setId(rs.getInt("id"));
        genre.setNameEs(rs.getString("name_es"));
        genre.setSlug(rs.getNString("slug"));
        return genre;
    }
}
