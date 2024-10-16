package com.libreria.david.controller.user.webModel.author;

public record AuthorDetails (
        Integer id,
        String name,
        String nationality,
        String biographyEs,
        Integer birthYear,
        Integer birthDeath
){
}

