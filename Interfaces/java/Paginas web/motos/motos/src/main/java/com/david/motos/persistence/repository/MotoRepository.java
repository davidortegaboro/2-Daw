package com.david.motos.persistence.repository;

import com.david.motos.domain.entity.Moto;

import java.util.List;

public interface MotoRepository {
    Moto findById(Integer id);

    List<Moto> findAll();

}
