package com.libreria.david.domain.admin.model;

import com.libreria.david.domain.admin.model.Author;
import com.libreria.david.domain.admin.model.Categorie;
import com.libreria.david.domain.admin.model.Genre;
import com.libreria.david.domain.admin.model.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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