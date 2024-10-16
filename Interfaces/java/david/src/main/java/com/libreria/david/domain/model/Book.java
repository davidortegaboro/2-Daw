package com.libreria.david.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
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
