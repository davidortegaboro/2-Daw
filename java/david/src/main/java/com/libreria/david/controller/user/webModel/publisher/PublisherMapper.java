package com.libreria.david.controller.user.webModel.publisher;

import com.libreria.david.domain.user.model.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherCollection toPublisherCollection(Publisher publisher);

    PublisherDetails toPublisherDetails(Publisher publisher);
}
