package com.libreria.david.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Genre {

    private Integer id;
    private String nameEs;
    private String slug;
}
