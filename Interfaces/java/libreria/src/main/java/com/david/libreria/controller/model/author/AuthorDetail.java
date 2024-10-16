package com.david.libreria.controller.model.author;

public record AuthorDetail (
         Integer id,
         String name,
         String nationality,
         String biography,
         Integer birthYear,
         Integer birthDeath
){
}

