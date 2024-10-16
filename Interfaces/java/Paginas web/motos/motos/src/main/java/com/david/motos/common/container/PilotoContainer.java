package com.david.motos.common.container;

import com.david.motos.domain.service.PilotoService;
import com.david.motos.domain.service.impl.PilotoServiceImpl;
import com.david.motos.persistence.dao.PilotoDao;
import com.david.motos.persistence.dao.impl.PilotoDaoImpl;
import com.david.motos.persistence.repository.PilotoRepository;
import com.david.motos.persistence.repository.impl.PilotoRepositoryImpl;

public class PilotoContainer {

    private static PilotoDao pilotoDao;

    private static PilotoRepository pilotoRepository;
    private static PilotoService pilotoService;

    public static PilotoDao getPilotoDao() {
        if (pilotoDao == null){
            pilotoDao = new PilotoDaoImpl();
        }
        return pilotoDao;
    }

    public static PilotoRepository getPilotoRepository() {
        if (pilotoRepository == null){
            pilotoRepository = new PilotoRepositoryImpl(getPilotoDao());
        }
        return pilotoRepository;
    }

    public static PilotoService getPilotoService() {
        if (pilotoService == null){
            pilotoService = new PilotoServiceImpl(getPilotoRepository());
        }
        return pilotoService;
    }
}
