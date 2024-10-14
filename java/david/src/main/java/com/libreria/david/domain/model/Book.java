package com.libreria.david.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer id;
    private String isbn;
    private String titleEs;
    private String synopsisEs;
    private double price;
    private double discount;
    private Publisher publisher;
    private Categorie categorie;
    private List<Genre> genreList;
    private List<Author> authorList;
}
