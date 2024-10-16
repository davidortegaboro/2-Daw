package com.david.motos.persistence.repository;

import com.david.motos.domain.entity.Equipo;

import java.util.List;

public interface EquipoRepository {

    Equipo findById(Integer id)throws RuntimeException;

    List<Equipo> findAll()throws RuntimeException;
}
