package com.match.v0.controller;

import com.match.v0.domain.entity.User;
import com.match.v0.domain.repository.UserRepository;
import com.match.v0.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
}
