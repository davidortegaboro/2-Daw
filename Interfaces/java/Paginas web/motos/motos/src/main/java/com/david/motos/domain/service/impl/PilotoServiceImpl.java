package com.david.motos.domain.service.impl;

import com.david.motos.domain.service.PilotoService;
import com.david.motos.persistence.repository.PilotoRepository;

public class PilotoServiceImpl implements PilotoService {

    private PilotoRepository pilotoRepository;

    public PilotoServiceImpl(PilotoRepository pilotoRepository) {
        this.pilotoRepository = pilotoRepository;
    }
}
