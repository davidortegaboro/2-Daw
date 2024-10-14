package com.libreria.david.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Publisher {

    private Integer id;
    private String name;
    private String slug;
}
