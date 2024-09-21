package com.daw.match.domain.entity;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String username;
    private String mail;
    private String password;

}
