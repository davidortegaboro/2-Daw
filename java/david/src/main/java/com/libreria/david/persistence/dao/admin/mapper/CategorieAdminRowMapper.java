package com.libreria.david.persistence.dao.admin.mapper;

import com.libreria.david.domain.admin.model.Categorie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategorieAdminRowMapper implements RowMapper<Categorie> {
    @Override
    public Categorie mapRow(ResultSet rs, int rowNum) throws SQLException {
        Categorie categorie = new Categorie();
        categorie.setId(rs.getInt("id"));
        categorie.setNameEs(rs.getNString("name_es"));
        categorie.setSlug(rs.getNString("slug"));
        return categorie;
    }
}
