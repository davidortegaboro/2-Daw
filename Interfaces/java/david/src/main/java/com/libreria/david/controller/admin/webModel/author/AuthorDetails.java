package com.libreria.david.controller.admin.webModel.author;

public record AuthorDetails (
        Integer id,
        String name,
        String nationality,
        String biographyEs,
        Integer birthYear,
        Integer birthDeath
){
}