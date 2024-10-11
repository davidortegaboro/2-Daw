package com.david.libreria.controller.model.genre;

import com.david.libreria.domain.entity.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenreMapper {

    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    GenreCollection toGenreCollection(Genre genre);

    GenreDetail toGenreDetail(Genre genre);

}
