package com.libreria.david.domain.user.model;

import com.libreria.david.domain.user.model.Author;
import com.libreria.david.domain.user.model.Categorie;
import com.libreria.david.domain.user.model.Genre;
import com.libreria.david.domain.user.model.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

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
