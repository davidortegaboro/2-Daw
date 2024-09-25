package com.david.libreria.domain.entity;

import lombok.Data;

@Data
public class Author {
    private Integer id;
    private String name;
    private String nationality;
    private String birthYear;
    private String birthDeath;
}
