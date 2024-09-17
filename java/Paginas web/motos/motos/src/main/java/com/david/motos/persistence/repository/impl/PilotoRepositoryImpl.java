package com.david.motos.persistence.repository.impl;

import com.david.motos.persistence.dao.PilotoDao;
import com.david.motos.persistence.repository.PilotoRepository;

public class PilotoRepositoryImpl implements PilotoRepository {

    private PilotoDao pilotoDao;

    public PilotoRepositoryImpl(PilotoDao pilotoDao) {
        this.pilotoDao = pilotoDao;
    }
}
