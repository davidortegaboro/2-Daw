package com.david.motos.persistence.dao;

import com.david.motos.domain.entity.Moto;

import java.util.List;

public interface MotoDao {

    Moto findById(Integer id);

    List<Moto> findAll();

    List<Moto> searchMotoByTeam(Integer id);
}
