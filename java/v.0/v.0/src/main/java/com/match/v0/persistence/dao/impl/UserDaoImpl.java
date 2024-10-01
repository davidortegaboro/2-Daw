package com.match.v0.persistence.dao.impl;

import com.match.v0.domain.entity.User;
import com.match.v0.persistence.dao.UserDao;
import com.match.v0.persistence.dao.impl.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Optional<User> findById(Integer id) {
        if (id == null){
            throw new RuntimeException("La id no puede ser nula");
        } else {
            String sql = "select user.* from user where id = ?";
            try{
                 User user = jdbcTemplate.queryForObject(sql, new UserMapper(), id);
                return Optional.of(user);
            } catch (RuntimeException e){
                System.out.println("Ha habido un error: " + e.getMessage());
                return Optional.empty();
            }
        }
    }

    @Override
    public List<User> findAll() {
        try{

            String sql = "select user.* from user";
            List<User> users  = jdbcTemplate.query(sql, new UserMapper());
            return users;

        } catch (RuntimeException e){

            System.out.println("Ha habido un error: " + e.getMessage());
            return null;
        }
    }
}
