package com.match.v0.persistence.dao.impl;

import com.match.v0.domain.entity.User;
import com.match.v0.persistence.dao.UserDao;

import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    @Override
    public Optional<UserDao> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
