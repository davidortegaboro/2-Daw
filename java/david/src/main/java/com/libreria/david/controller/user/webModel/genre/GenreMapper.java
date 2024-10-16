package com.libreria.david.controller.user.webModel.genre;

import com.libreria.david.domain.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenreMapper {

    GenreMapper ISNTANCE = Mappers.getMapper(GenreMapper.class);

    GenreCollection toGenreCollection(Genre genre);

    GenreDetails toGenreDetails(Genre genre);
}
