package com.match.v0.controller;

import com.match.v0.controller.webModel.user.UserCollection;
import com.match.v0.controller.webModel.user.UserDetails;
import com.match.v0.controller.webModel.user.UserMapper;
import com.match.v0.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("api/users")
    ResponseEntity<List<UserCollection>> getAll(){
        List<UserCollection> usersCollection = userService.findAll().stream().map(UserMapper.INSTANCE::toUserCollection).toList();
        return new ResponseEntity<>(usersCollection, HttpStatus.OK);
    }

    @GetMapping("api/users/{id}")
    ResponseEntity<UserDetails> findById(@PathVariable Integer id){
        UserDetails userDetails = UserMapper.INSTANCE.toUserDetails(userService.findById(id));
        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }
}
