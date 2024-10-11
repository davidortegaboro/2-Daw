package com.david.libreria.controller.model.author;

import com.david.libreria.domain.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Authorcollection toAuthorCollection(Author author);

    AuthorDetail toAuthorDetail(Author author);
}
