package com.libreria.david.controller.admin.webModel.author;


import com.libreria.david.domain.admin.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorCollection toAuthorCollection(Author author);
    AuthorDetails toAuthorDetails(Author author);
}
