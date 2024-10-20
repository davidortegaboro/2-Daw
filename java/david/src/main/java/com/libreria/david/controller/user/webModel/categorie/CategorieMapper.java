package com.libreria.david.controller.user.webModel.categorie;

import com.libreria.david.domain.user.model.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategorieMapper {

    CategorieMapper INSTANCE = Mappers.getMapper(CategorieMapper.class);

    CategorieCollection toCategorieCollection(Categorie categorie);

    CategorieDetails toCategorieDetails(Categorie categorie);
}
