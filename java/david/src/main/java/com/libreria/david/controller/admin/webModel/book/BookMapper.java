package com.libreria.david.controller.admin.webModel.book;

import com.libreria.david.domain.admin.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(Book book);

    BookDetails toBookDetails(Book book);
}
