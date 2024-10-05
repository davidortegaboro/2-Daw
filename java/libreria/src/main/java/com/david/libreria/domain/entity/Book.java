package com.david.libreria.domain.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@Data
@NoArgsConstructor
public class Book {

    private String isbn;
    private String title;
    private String synopsis;
    private BigDecimal price;
    private float discount;
    private String cover;
    private Publisher publisher;
    private Category category;
    private List<Author> authors;
    private List<Genre> genres;

}
