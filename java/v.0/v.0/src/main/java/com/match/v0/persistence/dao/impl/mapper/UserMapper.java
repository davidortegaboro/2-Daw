package com.match.v0.persistence.dao.impl.mapper;

import com.match.v0.domain.entity.User;
import com.match.v0.persistence.dao.UserDao;

import org.springframework.jdbc.core.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setMail(resultSet.getString("mail"));
        user.setPassword(resultSet.getString("password"));

        return user;
    }
}
