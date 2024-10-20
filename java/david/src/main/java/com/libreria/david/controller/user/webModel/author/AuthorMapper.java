package com.libreria.david.controller.user.webModel.author;

import com.libreria.david.domain.user.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorCollection toAuthorCollection(Author author);

    AuthorDetails toAuthorDetails(Author author);
}
