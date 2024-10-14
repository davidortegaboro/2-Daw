package com.libreria.david.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Author {

    private Integer id;
    private String name;
    private String nationality;
    private String biographyEs;
    private Integer birthYear;
    private Integer birthDeath;
}
