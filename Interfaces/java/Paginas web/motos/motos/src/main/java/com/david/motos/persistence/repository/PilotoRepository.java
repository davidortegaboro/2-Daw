package com.david.motos.persistence.repository;

import com.david.motos.domain.entity.Piloto;

import java.util.List;

public interface PilotoRepository {

    Piloto findById(Integer id) throws RuntimeException;

    List<Piloto> findAll() throws RuntimeException;
}
