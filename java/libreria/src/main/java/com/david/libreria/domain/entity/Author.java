package com.david.libreria.domain.entity;

import lombok.Data;

@Data
public class Author {
    private Integer id;
    private String name;
    private String nationality;
    private String biography;
    private Integer birthYear;
    private Integer birthDeath;
}
