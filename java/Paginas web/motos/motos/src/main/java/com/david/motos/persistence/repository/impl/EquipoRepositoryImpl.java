package com.david.motos.persistence.repository.impl;

import com.david.motos.domain.service.EquipoService;
import com.david.motos.persistence.dao.EquipoDao;
import com.david.motos.persistence.repository.EquipoRepository;

public class EquipoRepositoryImpl implements EquipoRepository {

    private EquipoDao equipoDao;

    public EquipoRepositoryImpl(EquipoDao equipoDao) {
        this.equipoDao = equipoDao;
    }
}
