package com.david.libreria.controller.model.book;

import com.david.libreria.domain.entity.Book;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookColletion toBookCollection (Book book);

    BookDetail toBookDetail(Book book);
}
