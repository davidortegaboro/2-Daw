package com.libreria.david.domain.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private Integer id;
    private String name;
    private String nationality;
    private String biographyEs;
    private Integer birthYear;
    private Integer birthDeath;
}
