package com.david.motos.persistence.repository.impl;

import com.david.motos.domain.entity.Equipo;
import com.david.motos.domain.service.EquipoService;
import com.david.motos.persistence.dao.EquipoDao;
import com.david.motos.persistence.repository.EquipoRepository;

import java.util.List;

public class EquipoRepositoryImpl implements EquipoRepository {

    private EquipoDao equipoDao;

    public EquipoRepositoryImpl(EquipoDao equipoDao) {
        this.equipoDao = equipoDao;
    }

    @Override
    public Equipo findById(Integer id) throws RuntimeException {
        return null;
    }

    @Override
    public List<Equipo> findAll() throws RuntimeException {
        return List.of();
    }
}
