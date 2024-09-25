package com.daw.match.persistence.dao;

import com.daw.match.domain.entity.User;

import java.util.Optional;

public interface UserDao {
    Optional<User> findById(Integer id);
}
