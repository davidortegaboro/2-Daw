package com.libreria.david.controller.admin.webModel.genre;


import com.libreria.david.domain.admin.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenreMapper {

    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    GenreCollection toGenreCollection(Genre genre);

    GenreDetails toGenreDetails(Genre genre);
}
