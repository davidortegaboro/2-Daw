package com.libreria.david.persistence.dao.user.mapper;

import com.libreria.david.domain.user.model.Categorie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategorieUserRowMapper implements RowMapper<Categorie> {
    @Override
    public Categorie mapRow(ResultSet rs, int rowNum) throws SQLException {
        Categorie categorie = new Categorie();
        categorie.setNameEs(rs.getNString("name_es"));
        categorie.setSlug(rs.getNString("slug"));
        return categorie;
    }
}