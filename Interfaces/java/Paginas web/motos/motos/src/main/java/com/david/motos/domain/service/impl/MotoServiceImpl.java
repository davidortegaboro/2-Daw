package com.david.motos.domain.service.impl;

import com.david.motos.domain.entity.Moto;
import com.david.motos.domain.service.MotoService;
import com.david.motos.persistence.repository.MotoRepository;

import java.util.List;

public class MotoServiceImpl implements MotoService {

    private MotoRepository motoRepository;

    public MotoServiceImpl(MotoRepository motoRepository) {
        this.motoRepository = motoRepository;
    }

    @Override
    public Moto findById(Integer id) {
        return null;
    }

    @Override
    public List<Moto> findAll() {
        return null;
    }

    @Override
    public List<Moto> searchMotoByTeam(Integer id) {
        return null;
    }
}
