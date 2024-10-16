package com.match.v0.controller.webModel.user;
import com.match.v0.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCollection toUserCollection(User user);

    UserDetails toUserDetails(User user);
}
