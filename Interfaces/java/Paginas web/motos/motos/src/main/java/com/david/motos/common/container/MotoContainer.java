package com.david.motos.common.container;

import com.david.motos.domain.service.MotoService;
import com.david.motos.domain.service.impl.MotoServiceImpl;
import com.david.motos.persistence.dao.MotoDao;
import com.david.motos.persistence.dao.impl.MotoDaoImpl;
import com.david.motos.persistence.repository.MotoRepository;
import com.david.motos.persistence.repository.impl.MotoRepositoryImpl;

public class MotoContainer {

    private static MotoDao motoDao;

    private static MotoRepository motoRepository;

    private static MotoService motoService;

    public static MotoDao getMotoDao() {
        if (motoDao == null){
            motoDao = new MotoDaoImpl();
        }
        return motoDao;
    }

    public static MotoRepository getMotoRepository() {
        if (motoRepository == null){
            motoRepository = new MotoRepositoryImpl(getMotoDao());
        }
        return motoRepository;
    }

    public static MotoService getMotoService() {
        if (motoService == null){
            motoService = new MotoServiceImpl(getMotoRepository());
        }
        return motoService;
    }
}
