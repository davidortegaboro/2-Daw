package com.match.v0.persistence.dao;

import com.match.v0.domain.entity.User;
import com.match.v0.domain.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    Optional<UserDao> findById(Integer id);

    List<User> findAll();

}
