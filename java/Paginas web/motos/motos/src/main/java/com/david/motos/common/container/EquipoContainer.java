package com.david.motos.common.container;

import com.david.motos.domain.service.EquipoService;
import com.david.motos.domain.service.impl.EquipoServiceImpl;
import com.david.motos.persistence.dao.EquipoDao;
import com.david.motos.persistence.dao.impl.EquipoDaoImpl;
import com.david.motos.persistence.repository.EquipoRepository;
import com.david.motos.persistence.repository.impl.EquipoRepositoryImpl;

public class EquipoContainer {

    private static EquipoDao equipoDao;
    private static EquipoRepository equipoRepository;
    private static EquipoService equipoService;

    public static EquipoDao getEquipoDao() {
        if (equipoDao == null){
            equipoDao = new EquipoDaoImpl();
        }
        return equipoDao;
    }

    public static EquipoRepository getEquipoRepository() {
        if (equipoRepository == null){
            equipoRepository = new EquipoRepositoryImpl(getEquipoDao());
        }
        return equipoRepository;
    }

    public static EquipoService getEquipoService() {
        if (equipoService == null){
            equipoService = new EquipoServiceImpl(getEquipoRepository());
        }
        return equipoService;
    }
}
