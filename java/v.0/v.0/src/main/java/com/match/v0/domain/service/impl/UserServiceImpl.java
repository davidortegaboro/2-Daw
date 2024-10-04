package com.match.v0.domain.service.impl;


import com.match.v0.domain.entity.User;
import com.match.v0.domain.exception.ResourceNotFoundException;
import com.match.v0.domain.repository.UserRepository;
import com.match.v0.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ha habido un error"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
