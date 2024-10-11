package com.david.libreria.controller.model.book;

import com.david.libreria.domain.entity.Author;
import com.david.libreria.domain.entity.Category;
import com.david.libreria.domain.entity.Genre;
import com.david.libreria.domain.entity.Publisher;

import java.math.BigDecimal;
import java.util.List;

public record BookDetail  (
         String isbn,
         String title,
         String synopsis,
         BigDecimal price,
         float discount,
         String cover,
         Publisher publisher,
         Category category,
         List<Author>authors,
         List<Genre> genres
){
}
