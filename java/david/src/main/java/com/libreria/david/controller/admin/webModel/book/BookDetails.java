package com.libreria.david.controller.admin.webModel.book;

import com.libreria.david.domain.model.Author;
import com.libreria.david.domain.model.Categorie;
import com.libreria.david.domain.model.Genre;
import com.libreria.david.domain.model.Publisher;

import java.util.List;

public record BookDetails (
        Integer id,
        String isbn,
        String titleEs,
        String synopsisEs,
        double price,
        double discount,
        Publisher publisher,
        Categorie categorie,
        List<Genre> genreList,
        List<Author> authorList
){
}
