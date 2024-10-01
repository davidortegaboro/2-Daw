package com.match.v0.domain.service;

import com.match.v0.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
