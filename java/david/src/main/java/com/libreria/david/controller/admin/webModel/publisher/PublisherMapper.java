package com.libreria.david.controller.admin.webModel.publisher;


import com.libreria.david.domain.admin.model.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherCollection toPublisherCollection(Publisher publisher);

    PublisherDetails toPublisherDetails(Publisher publisher);

}
