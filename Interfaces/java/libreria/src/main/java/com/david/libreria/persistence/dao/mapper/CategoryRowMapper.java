package com.david.libreria.persistence.dao.mapper;

import com.david.libreria.domain.entity.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<Category> {


    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        Category category = new Category();

        category.setId(rs.getInt("id"));
        category.setName(rs.getNString("name_es"));
        category.setSlug(rs.getNString("slug"));

        return category;
    }
}
