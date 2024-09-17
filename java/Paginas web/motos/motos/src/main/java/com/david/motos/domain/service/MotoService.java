package com.david.motos.domain.service;

import com.david.motos.domain.entity.Moto;

import java.util.List;

public interface MotoService {

    Moto findById(Integer id);

    List<Moto> findAll();

    List<Moto> searchMotoByTeam(Integer id);
}
