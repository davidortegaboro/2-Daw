package com.david.libreria.persistence.dao.mapper;

import com.david.libreria.domain.entity.Author;
import org.springframework.jdbc.core.RowMapper;


import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper implements RowMapper<Author>{

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author 
    }
}
