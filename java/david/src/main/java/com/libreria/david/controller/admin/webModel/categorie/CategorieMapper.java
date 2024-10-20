package com.libreria.david.controller.admin.webModel.categorie;


import com.libreria.david.domain.admin.model.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategorieMapper {

    CategorieMapper INSTANCE = Mappers.getMapper(CategorieMapper.class);

    CategorieCollection toCategorieCollection(Categorie categorie);

    CategorieDetails toCategorieDetails(Categorie categorie);
}
