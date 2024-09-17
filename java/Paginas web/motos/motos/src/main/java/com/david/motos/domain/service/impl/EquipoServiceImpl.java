package com.david.motos.domain.service.impl;

import com.david.motos.domain.entity.Equipo;
import com.david.motos.domain.service.EquipoService;
import com.david.motos.persistence.repository.EquipoRepository;

public class EquipoServiceImpl implements EquipoService {

    private EquipoRepository equipoRepository;

    public EquipoServiceImpl(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @Override
    public Equipo findById(Integer id) {
        return null;
    }
}
