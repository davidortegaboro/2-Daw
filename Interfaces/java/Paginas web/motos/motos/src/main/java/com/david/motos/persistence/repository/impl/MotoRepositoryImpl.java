package com.david.motos.persistence.repository.impl;

import com.david.motos.domain.entity.Moto;
import com.david.motos.persistence.dao.MotoDao;
import com.david.motos.persistence.repository.MotoRepository;

import java.util.List;

public class MotoRepositoryImpl implements MotoRepository {

    private MotoDao motoDao;

    public MotoRepositoryImpl(MotoDao motoDao) {
        this.motoDao = motoDao;
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
