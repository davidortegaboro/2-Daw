package com.libreria.david.controller.model.author;

public record AuthorDetails (
         Integer id,
         String name,
         String nationality,
         String biographyEs,
         Integer birthYear,
         Integer birthDeath
){
}
