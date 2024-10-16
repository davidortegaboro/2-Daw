package com.libreria.david.controller.admin.webModel.genre;

import com.libreria.david.controller.admin.webModel.genre.GenreCollection;
import com.libreria.david.controller.admin.webModel.genre.GenreDetails;
import com.libreria.david.domain.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenreMapper {

    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    GenreCollection toGenreCollection(Genre genre);

    GenreDetails toGenreDetails(Genre genre);
}
