package com.libreria.david.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private int id;
    private String name;
    private String nationality;
    private String biographyEs;
    private Integer birthYear;
    private Integer birthDeath;
}