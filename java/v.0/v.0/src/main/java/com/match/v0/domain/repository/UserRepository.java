package com.match.v0.domain.repository;

import com.match.v0.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Integer id);

    List<User> findAll();

}
