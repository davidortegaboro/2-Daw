package com.david.motos.persistence.repository.impl;

import com.david.motos.domain.entity.Piloto;
import com.david.motos.persistence.dao.PilotoDao;
import com.david.motos.persistence.repository.PilotoRepository;

import java.util.List;

public class PilotoRepositoryImpl implements PilotoRepository {

    private PilotoDao pilotoDao;

    public PilotoRepositoryImpl(PilotoDao pilotoDao) {
        this.pilotoDao = pilotoDao;
    }

    @Override
    public Piloto findById(Integer id) throws RuntimeException {
        return null;
    }

    @Override
    public List<Piloto> findAll() throws RuntimeException {
        return List.of();
    }
}
